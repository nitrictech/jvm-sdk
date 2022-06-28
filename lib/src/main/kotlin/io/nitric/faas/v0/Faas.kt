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

enum class HttpMethod {
    GET,
    POST,
    DELETE,
    PUT,
    PATCH,
    OPTIONS,
}

internal interface FaasOptions {}

internal class ApiWorkerOptions(val api: String, val route: String, val method: Set<HttpMethod>): FaasOptions {}

internal class SubscriptionWorkerOptions(val topic: String): FaasOptions {}

enum class Frequency {
    Days, Hours, Minutes
}

internal class ScheduleWorkerOptions(val description: String, val rate: Number, val frequency: Frequency): FaasOptions {}

internal class Faas constructor(val opts: FaasOptions) {
    val logger = Logger.getLogger(Faas::javaClass.name)

    var httpHandler: Handler<HttpContext>? = null
    var eventHandler: Handler<EventContext>? = null
    val client: FaasServiceStub = FaasServiceGrpc.newStub(GrpcChannelProvider.getChannel())
    var stream: StreamObserver<ClientMessage>? = null

    fun event(middleware: Handler<EventContext>) = fluently {
        this.eventHandler = middleware
    }

    fun http(middleware: Handler<HttpContext>) = fluently {
        this.httpHandler = middleware
    }

    internal suspend fun start() {
        if (this.eventHandler == null && this.httpHandler == null) {
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
                                    if(httpHandler == null) {
                                        throw IllegalArgumentException("Cannot handle HTTP request")
                                    }

                                    val ctx: HttpContext = TriggerContext.fromGrpcTriggerRequest(value.triggerRequest)
                                    httpHandler!!(ctx)
                                }
                                TriggerRequest.ContextCase.TOPIC -> {
                                    if(eventHandler == null) {
                                        throw IllegalArgumentException("Cannot handle event request")
                                    }

                                    val ctx: EventContext = TriggerContext.fromGrpcTriggerRequest(value.triggerRequest)
                                    eventHandler!!(ctx)
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

