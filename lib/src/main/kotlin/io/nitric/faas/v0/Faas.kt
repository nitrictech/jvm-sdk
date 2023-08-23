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
import io.nitric.api.storage.v0.Bucket
import io.nitric.proto.faas.v1.*
import io.nitric.proto.faas.v1.FaasServiceGrpc.FaasServiceStub
import io.nitric.proto.faas.v1.ApiWorkerOptions as ProtoApiWorkerOptions
import io.nitric.resources.SecurityDefinition
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
internal class ApiWorkerOptions(
    val api: String,
    val route: String,
    val method: Set<HttpMethod>,
    val options: MethodOptions
) : FaasOptions {
    fun toWire(): ApiWorker {
        val workerOptions = ProtoApiWorkerOptions.newBuilder()

        if (this.options.security.isEmpty()) {
            workerOptions.securityDisabled = false
        } else {
            this.options.security.forEach {
                val scopes = ApiWorkerScopes.newBuilder().addAllScopes(it.value).build()

                workerOptions.putSecurity(it.key, scopes)
            }
        }

        return ApiWorker.newBuilder()
            .setApi(this.api)
            .setPath(this.route)
            .setOptions(workerOptions)
            .addAllMethods(this.method.map { it.name })
            .build()
    }
}

internal class MethodOptions(
    val security: Map<String, List<String>>,
    val securityDefinitions: Map<String, SecurityDefinition>
)

/**
 * Options for subscription trigger handling workers for the [topic].
 */
internal class SubscriptionWorkerOptions(val topic: String) : FaasOptions {
    fun toWire(): SubscriptionWorker {
        return SubscriptionWorker.newBuilder()
            .setTopic(this.topic)
            .build()
    }
}

/**
 * Represents schedule frequency value.
 */
enum class Frequency {
    Days, Hours, Minutes
}


internal abstract class ScheduleWorkerOptions(val description: String) : FaasOptions {}

/**
 * Options for schedule trigger handling workers. Has a [description], [rate], and [frequency].
 */
internal class ScheduleWorkerRateOptions(description: String, val rate: Number, val frequency: Frequency) :
    ScheduleWorkerOptions(description) {
    fun toWire(): ScheduleWorker {
        return ScheduleWorker.newBuilder()
            .setRate(ScheduleRate.newBuilder().setRate("${this.rate} ${this.frequency.toString().lowercase()}"))
            .setKey(this.description)
            .build()
    }
}

/**
 * Options for schedule trigger with [cron] expressions
 */
internal class ScheduleWorkerCronOptions(description: String, val cron: String) : ScheduleWorkerOptions(description) {
    fun toWire(): ScheduleWorker {
        return ScheduleWorker.newBuilder()
            .setCron(
                ScheduleCron.newBuilder()
                    .setCron(this.cron).build()
            ).setKey(this.description)
            .build()
    }
}

/**
 * Options for bucket notification subscription for a specific [bucket] and [notificationType]. Filtered by a [notificationPrefixFilter].
 */
internal class BucketNotificationWorkerOptions(
    val bucket: String,
    val notificationType: BucketNotificationType,
    val notificationPrefixFilter: String
) : FaasOptions {
    fun toWire(): BucketNotificationWorker {
        val notificationType = when (notificationType) {
            BucketNotificationType.Write -> io.nitric.proto.faas.v1.BucketNotificationType.Created
            BucketNotificationType.Delete -> io.nitric.proto.faas.v1.BucketNotificationType.Deleted
            else -> {
                throw IllegalArgumentException("unsupported bucket notification type $notificationType")
            }
        }

        return BucketNotificationWorker.newBuilder()
            .setBucket(this.bucket)
            .setConfig(
                BucketNotificationConfig.newBuilder()
                    .setNotificationType(notificationType)
                    .setNotificationPrefixFilter(this.notificationPrefixFilter)
                    .build()
            ).build()
    }
}

/**
 * Options for file notification subscription for a specific [bucket] and [notificationType]. Filtered by a [notificationPrefixFilter].
 */
internal class FileNotificationWorkerOptions(
    val bucket: Bucket,
    val notificationType: BucketNotificationType,
    val notificationPrefixFilter: String
) : FaasOptions {
    fun toWire(): BucketNotificationWorker {
        val notificationType = when (notificationType) {
            BucketNotificationType.Write -> io.nitric.proto.faas.v1.BucketNotificationType.Created
            BucketNotificationType.Delete -> io.nitric.proto.faas.v1.BucketNotificationType.Deleted
            else -> {
                throw IllegalArgumentException("unsupported bucket notification type $notificationType")
            }
        }

        return BucketNotificationWorker.newBuilder()
            .setBucket(this.bucket.name)
            .setConfig(
                BucketNotificationConfig.newBuilder()
                    .setNotificationType(notificationType)
                    .setNotificationPrefixFilter(this.notificationPrefixFilter)
                    .build()
            ).build()
    }
}

/**
 * Options for a websocket worker filtered by the [socket] name and the [eventType].
 */
internal class WebsocketWorkerOptions(val socket: String, val eventType: WebsocketEventType) : FaasOptions {
    fun toWire(): WebsocketWorker {
        val eventType = when (eventType) {
            WebsocketEventType.Connect -> WebsocketEvent.Connect
            WebsocketEventType.Disconnect -> WebsocketEvent.Disconnect
            WebsocketEventType.Message -> WebsocketEvent.Message
            else -> WebsocketEvent.UNRECOGNIZED
        }

        return WebsocketWorker.newBuilder()
            .setSocket(this.socket)
            .setEvent(eventType)
            .build()
    }
}

/**
 * Function as a Service server with [opts].
 *
 * Registers itself with a Nitric Server then routes incoming requests to the appropriate workers.
 */
internal class Faas constructor(val opts: FaasOptions) {
    val logger = Logger.getLogger(Faas::javaClass.name)

    private var httpHandlers: MutableList<Middleware<HttpContext>> = mutableListOf()
    private var eventHandlers: MutableList<Middleware<EventContext>> = mutableListOf()
    private var bucketNotificationHandlers: MutableList<Middleware<BucketNotificationContext>> = mutableListOf()
    private var websocketHandlers: MutableList<Middleware<WebsocketContext>> = mutableListOf()
    private var fileNotificationHandlers: MutableList<Middleware<FileNotificationContext>> = mutableListOf()

    val client: FaasServiceStub = FaasServiceGrpc.newStub(GrpcChannelProvider.getChannel())
    var stream: StreamObserver<ClientMessage>? = null

    fun event(middleware: Middleware<EventContext>) = fluently {
        this.eventHandlers.add(middleware)
    }

    fun http(middleware: Middleware<HttpContext>) = fluently {
        this.httpHandlers.add(middleware)
    }

    fun bucketNotification(middleware: Middleware<BucketNotificationContext>) = fluently {
        this.bucketNotificationHandlers.add(middleware)
    }

    fun fileNotification(middleware: Middleware<FileNotificationContext>) = fluently {
        this.fileNotificationHandlers.add(middleware)
    }

    fun websocket(middleware: Middleware<WebsocketContext>) = fluently {
        this.websocketHandlers.add(middleware)
    }

    /**
     * Start the FaaS service to start receiving requests from the nitric Server
     */
    internal suspend fun start() {
        if (this.eventHandlers.size == 0 && this.httpHandlers.size == 0 && this.fileNotificationHandlers.size == 0 && this.bucketNotificationHandlers.size == 0 && this.websocketHandlers.size == 0) {
            throw Error("A handler function must be provided")
        }

        val latch = CountDownLatch(1);

        this.stream = this.client.triggerStream(
            object : StreamObserver<ServerMessage> {
                override fun onNext(value: ServerMessage?) {
                    when (value?.contentCase) {
                        ServerMessage.ContentCase.INIT_RESPONSE -> {}// NO-OP
                        ServerMessage.ContentCase.TRIGGER_REQUEST
                        -> {
                            val retCtx: TriggerContext<*, *> = when (value.triggerRequest?.contextCase) {
                                TriggerRequest.ContextCase.HTTP -> {
                                    if (httpHandlers.size == 0) {
                                        throw IllegalArgumentException("Cannot handle HTTP request")
                                    }

                                    val ctx: HttpContext =
                                        TriggerContext.fromGrpcTriggerRequest(value.triggerRequest, opts)

                                    val lastCall = { context: HttpContext ->
                                        context
                                    }

                                    val composedHandler = httpHandlers.foldRight(lastCall) { handler, next ->
                                        { context ->
                                            handler(context, next)
                                        }
                                    }

                                    composedHandler(ctx)
                                }

                                TriggerRequest.ContextCase.TOPIC -> {
                                    if (eventHandlers.size == 0) {
                                        throw IllegalArgumentException("Cannot handle event request")
                                    }

                                    val ctx: EventContext =
                                        TriggerContext.fromGrpcTriggerRequest(value.triggerRequest, opts)

                                    val lastCall = { context: EventContext ->
                                        context
                                    }

                                    val composedHandler = eventHandlers.foldRight(lastCall) { handler, next ->
                                        { context ->
                                            handler(context, next)
                                        }
                                    }

                                    composedHandler(ctx)
                                }

                                TriggerRequest.ContextCase.NOTIFICATION -> {
                                    when (opts) {
                                        is BucketNotificationWorkerOptions -> {
                                            if (bucketNotificationHandlers.size == 0) {
                                                throw IllegalArgumentException("Cannot handle bucket notification request")
                                            }

                                            val ctx: BucketNotificationContext =
                                                TriggerContext.fromGrpcTriggerRequest(value.triggerRequest, opts)

                                            val lastCall = { context: BucketNotificationContext ->
                                                context
                                            }

                                            val composeHandler =
                                                bucketNotificationHandlers.foldRight(lastCall) { handler, next ->
                                                    { context ->
                                                        handler(context, next)
                                                    }
                                                }

                                            composeHandler(ctx)
                                        }

                                        is FileNotificationWorkerOptions -> {
                                            if (fileNotificationHandlers.size == 0) {
                                                throw IllegalArgumentException("Cannot handle bucket notification request")
                                            }

                                            val ctx: FileNotificationContext =
                                                TriggerContext.fromGrpcTriggerRequest(value.triggerRequest, opts)

                                            val lastCall = { context: FileNotificationContext ->
                                                context
                                            }

                                            val composeHandler =
                                                fileNotificationHandlers.foldRight(lastCall) { handler, next ->
                                                    { context ->
                                                        handler(context, next)
                                                    }
                                                }

                                            composeHandler(ctx)
                                        }

                                        else -> {
                                            throw IllegalArgumentException("trigger request is for a notification but no handlers are available")
                                        }
                                    }
                                }

                                TriggerRequest.ContextCase.WEBSOCKET -> {
                                    if (websocketHandlers.size == 0) {
                                        throw IllegalArgumentException("Cannot handle websocket request")
                                    }

                                    val ctx: WebsocketContext =
                                        TriggerContext.fromGrpcTriggerRequest(value.triggerRequest, opts)

                                    val lastCall = { context: WebsocketContext ->
                                        context
                                    }

                                    val composeHandler = websocketHandlers.foldRight(lastCall) { handler, next ->
                                        { context ->
                                            handler(context, next)
                                        }
                                    }

                                    composeHandler(ctx)
                                }

                                else -> throw IllegalArgumentException("Invalid trigger request")
                            }

                            stream?.onNext(
                                ClientMessage.newBuilder()
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
                                "error occurred connecting to Nitric membrane: ${
                                    GrpcChannelProvider.getChannel().authority()
                                }",
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

        val initReq: InitRequest = when (this.opts) {
            is ApiWorkerOptions -> InitRequest.newBuilder().setApi(this.opts.toWire()).build()
            is ScheduleWorkerRateOptions -> InitRequest.newBuilder().setSchedule(this.opts.toWire()).build()
            is ScheduleWorkerCronOptions -> InitRequest.newBuilder().setSchedule(this.opts.toWire()).build()
            is SubscriptionWorkerOptions -> InitRequest.newBuilder().setSubscription(this.opts.toWire()).build()
            is WebsocketWorkerOptions -> InitRequest.newBuilder().setWebsocket(this.opts.toWire()).build()
            is BucketNotificationWorkerOptions -> InitRequest.newBuilder().setBucketNotification(this.opts.toWire())
                .build()

            is FileNotificationWorkerOptions -> InitRequest.newBuilder().setBucketNotification(this.opts.toWire())
                .build()

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

