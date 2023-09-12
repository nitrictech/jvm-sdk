package io.nitric.resources

import com.google.protobuf.ByteString
import io.nitric.Nitric
import io.nitric.faas.v0.*
import io.nitric.faas.v0.Faas
import io.nitric.proto.resource.v1.*
import io.nitric.proto.websocket.v1.WebsocketCloseRequest
import io.nitric.proto.websocket.v1.WebsocketSendRequest
import io.nitric.proto.websocket.v1.WebsocketServiceGrpc
import io.nitric.util.GrpcChannelProvider
import io.nitric.proto.resource.v1.Resource as ProtoResource
import io.nitric.util.fluently
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

/**
 * A class that contains the details of the websocket.
 * [url] the deployed url of the websocket
 * [id] the id of the deployed websocket
 * [provider] the cloud provider the websocket is deployed on
 * [service] the cloud service that implements this websocket (i.e. AWS API Gateway)
 */
class WebsocketDetails(val url: String, id: String, provider: String, service: String): ResourceDetails(id, provider, service)


class WebsocketResource internal constructor(name: String) : Resource(name, ResourceType.Websocket) {
    // The document gRPC client
    private val websocketClient = WebsocketServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())

    override fun register() = fluently {
        registerResource(this)
    }

    private fun registerResource(resource: WebsocketResource) = runBlocking {
        async {
            resource.client.declare(
                ResourceDeclareRequest.newBuilder()
                    .setResource(
                        resource.asProtoResource()
                    )
                    .build()
            )
        }.await()
    }

    /**
     * Register a websocket handler.
     * @param eventType the event type to trigger on, either connect, disconnect, or message
     * @param middleware the middleware that should run when the event is triggered
     */
    fun on(eventType: WebsocketEventType, middleware: List<Middleware<WebsocketContext>>) {
        val faas = Faas(WebsocketWorkerOptions(this.name, eventType))
        middleware.forEach { faas.websocket(it) }
        Nitric.registerWorker(faas)
    }

    /**
     * Register a websocket handler.
     * @param eventType the event type to trigger on, either connect, disconnect, or message
     * @param middleware the middleware that should run when the event is triggered
     */
    fun on(eventType: WebsocketEventType, middleware: Handler<WebsocketContext>) {
        val faas = Faas(WebsocketWorkerOptions(this.name, eventType))
        faas.websocket { ctx, _ -> middleware(ctx) }
        Nitric.registerWorker(faas)
    }

    /**
     * Retrieve the details of the deployed websocket including the URL and the provider it's deployed on.
     */
    fun details(): WebsocketDetails {
        val detailsRequest = ResourceDetailsRequest.newBuilder()
            .setResource(
                ProtoResource.newBuilder()
                    .setName(this.name)
                    .setType(ResourceType.Websocket)
                    .build()
            ).build()

        val detailsResponse = this.client.details(detailsRequest);
        return WebsocketDetails(
            detailsResponse.websocket.url,
            detailsResponse.id,
            detailsResponse.provider,
            detailsResponse.service
        )
    }

    /**
     * Close the connection the socket has with the specific [connectionId]
     * @param connectionId the specific connection that should be closed
     */
    fun close(connectionId: String) {
        this.websocketClient.close(
            WebsocketCloseRequest.newBuilder()
                .setConnectionId(connectionId)
                .setSocket(this.name)
                .build()
        )
    }

    /**
     * Send a [message] to a specific connection.
     * @param connectionId the id of the connection that the message should be sent to.
     * @param message the message that should be sent
     */
    fun send(connectionId: String, message: String) {
        this.websocketClient.send(
            WebsocketSendRequest.newBuilder()
                .setConnectionId(connectionId)
                .setSocket(this.name)
                .setData(ByteString.copyFromUtf8(message))
                .build()
        )
    }

    /**
     * Send a [message] to a specific connection.
     * @param connectionId the id of the connection that the message should be sent to.
     * @param message the message that should be sent
     */
    fun send(connectionId: String, message: ByteArray) {
        this.websocketClient.send(
            WebsocketSendRequest.newBuilder()
                .setConnectionId(connectionId)
                .setSocket(this.name)
                .setData(ByteString.copyFrom(message))
                .build()
        )
    }
}

