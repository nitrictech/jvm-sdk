// Copyright 2021, Nitric Technologies Pty Ltd.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package io.nitric.faas.v0

import io.grpc.Status.Code
import io.grpc.StatusRuntimeException
import io.grpc.stub.StreamObserver
import io.nitric.proto.faas.v1.*
import io.nitric.proto.faas.v1.FaasServiceGrpc.FaasServiceStub
import io.nitric.util.GrpcChannelProvider
import io.nitric.util.error
import io.nitric.util.fluently
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.concurrent.CountDownLatch
import java.util.logging.Logger

/**
 * Supported HTTP request methods.
 */
enum class HttpMethod {
    GET,
    POST,
    DELETE,
    PUT,
    PATCH,
    OPTIONS,
}

/**
 * Common Function as a Service worker options.
 */
internal interface FaasOptions {}

/**
 * Options for API request handling workers.
 * With the name of the [api], the [route] for the worker handler, and the HTTP [method] this worker can respond to.
 */
internal class ApiWorkerOptions(val api: String, val route: String, val method: Set<HttpMethod>): FaasOptions {}

/**
 * Options for subscription trigger handling workers for the [topic].
 */
internal class SubscriptionWorkerOptions(val topic: String): FaasOptions {}

/**
 * Represents schedule frequency value.
 */
enum class Frequency {
    Days, Hours, Minutes
}

/**
 * Options for schedule trigger handling workers. Has a [description], [rate], and [frequency].
 */
internal class ScheduleWorkerOptions(val description: String, val rate: Number, val frequency: Frequency): FaasOptions {}

/**
 * Function as a Service server with [opts].
 *
 * Registers itself with a Nitric Server then routes incoming requests to the appropriate workers.
 */
internal class Faas constructor(val opts: FaasOptions) {
    val logger = Logger.getLogger(Faas::javaClass.name)

    var httpHandlers: MutableList<Handler<HttpContext>> = mutableListOf()
    var eventHandlers: MutableList<Handler<EventContext>> = mutableListOf()
    val client: FaasServiceStub = FaasServiceGrpc.newStub(GrpcChannelProvider.getChannel())
    var stream: StreamObserver<ClientMessage>? = null

    fun event(middleware: Handler<EventContext>) = fluently {
        this.eventHandlers.add(middleware)
    }

    fun http(middleware: Handler<HttpContext>) = fluently {
        this.httpHandlers.add(middleware)
    }

    /**
     * Start the FaaS service to start receiving requests from the nitric Server
     */
    internal suspend fun start() {
        if (this.eventHandlers.size == 0 && this.httpHandlers.size == 0) {
            throw Error("A handler function must be provided")
        }

        val latch: CountDownLatch = CountDownLatch(1);

        this.stream = this.client.triggerStream(
            object : StreamObserver<ServerMessage> {
                override fun onNext(value: ServerMessage?) {
                    when (value?.contentCase) {
                        ServerMessage.ContentCase.INIT_RESPONSE -> {}// NO-OP
                        ServerMessage.ContentCase.TRIGGER_REQUEST
                        -> {
                            val retCtx: TriggerContext<*,*> = when (value.triggerRequest?.contextCase) {
                                TriggerRequest.ContextCase.HTTP -> {
                                    if(httpHandlers.size == 0) {
                                        throw IllegalArgumentException("Cannot handle HTTP request")
                                    }

                                    val ctx: HttpContext = TriggerContext.fromGrpcTriggerRequest(value.triggerRequest)
                                    httpHandlers.forEach() { handler -> handler(ctx) }
                                    ctx
                                }
                                TriggerRequest.ContextCase.TOPIC -> {
                                    if(eventHandlers.size == 0) {
                                        throw IllegalArgumentException("Cannot handle event request")
                                    }

                                    val ctx: EventContext = TriggerContext.fromGrpcTriggerRequest(value.triggerRequest)
                                    eventHandlers.forEach() { handler -> handler(ctx) }
                                    ctx
                                }
                                else -> throw IllegalArgumentException("Invalid trigger request")
                            }

                            stream?.onNext(ClientMessage.newBuilder()
                                .setId(value.id)
                                .setTriggerResponse(TriggerContext.toGrpcTriggerResponse(retCtx))
                                .build()
                            )
                        }
                        else -> { // error

                        }
                    }
                }

                override fun onError(t: Throwable?) {
                    if (t is StatusRuntimeException) {
                        if (t.getStatus().getCode().equals(Code.UNAVAILABLE)) {
                            logger.error(
                                t,
                                "error occurred connecting to Nitric membrane: ${GrpcChannelProvider.getChannel().authority()}",
                            )
                            return
                        }
                    }
                    logger.error(t, "error occurred")
                }

                override fun onCompleted() {
                    latch.countDown()
                }
            }
        )

        val initReq: InitRequest = when(this.opts) {
            is ApiWorkerOptions -> InitRequest.newBuilder().setApi(
                ApiWorker.newBuilder()
                    .setApi(this.opts.api)
                    .setPath(this.opts.route)
                    .addAllMethods(this.opts.method.map { it.name })
                    .build()
                ).build()

            is ScheduleWorkerOptions -> InitRequest.newBuilder().setSchedule(
                ScheduleWorker.newBuilder()
                    .setRate(ScheduleRate.newBuilder().setRate("${this.opts.rate} ${this.opts.frequency.toString().lowercase()}"))
                    .setKey(this.opts.description)
                    .build()
            ).build()
            is SubscriptionWorkerOptions -> InitRequest.newBuilder().setSubscription(
                    SubscriptionWorker.newBuilder()
                        .setTopic(this.opts.topic)
                        .build()
                ).build()
            else -> throw java.lang.IllegalArgumentException("Invalid worker options")
        }

        // send the init request for this worker type
        this.stream?.onNext(ClientMessage.newBuilder().setInitRequest(initReq).build())


        // Block on latch, TODO: We need a way to unblock these at runtime to allow new definitions through
        // Essentially all instances of faas executions needs to be implemented in a concurrency group
        // that allows the parent process to exit gracefully when all children exit
        withContext(Dispatchers.IO) {
            latch.await()
        }
    }
}

