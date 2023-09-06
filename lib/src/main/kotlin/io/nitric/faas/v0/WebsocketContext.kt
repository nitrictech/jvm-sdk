package io.nitric.faas.v0

import io.nitric.proto.faas.v1.TriggerRequest
import io.nitric.proto.faas.v1.TriggerResponse
import io.nitric.proto.faas.v1.WebsocketResponseContext

/**
 * Represents the [req]/[resp] context for an event.
 */
data class WebsocketContext internal constructor(
    override val req: WebsocketRequest,
    override val resp: WebsocketResponse
) : TriggerContext<WebsocketRequest, WebsocketResponse>() {
    companion object {
        /**
         * Construct an event topic from a trigger [request] gRPC object.
         */
        internal fun fromGrpcTriggerRequest(request: TriggerRequest): WebsocketContext {
            val websocketEvent = request.websocket

            // Converts the proto bucket notification type to SDK notification type
            if (websocketEvent.event.ordinal > 2) {
                throw IllegalArgumentException("unsupported websocket event type: ${websocketEvent.event.name}")
            }
            val eventType = WebsocketEventType.values()[websocketEvent.event.ordinal]

            val queryParams = websocketEvent.queryParamsMap.entries.map {
                val value = it.value.valueList.toList()

                it.key to value
            }

            return WebsocketContext(
                WebsocketRequest(request.data.toByteArray(), websocketEvent.socket, eventType, websocketEvent.connectionId, queryParams.toMap()),
                WebsocketResponse(true)
            )
        }

        /**
         * Construct a gRPC trigger response from this [ctx].
         */
        internal fun toGrpcTriggerResponse(ctx: WebsocketContext): TriggerResponse {
            return TriggerResponse.newBuilder()
                .setWebsocket(
                    WebsocketResponseContext.newBuilder()
                        .setSuccess(ctx.resp.success)
                        .build()
                )
                .build()
        }
    }
}

enum class WebsocketEventType {
    Connect,
    Disconnect,
    Message
}

/**
 * Represents a request pushed to a [socket].
 */
class WebsocketRequest internal constructor(
    data: ByteArray,
    val socket: String,
    val eventType: WebsocketEventType,
    val connectionId: String,
    val query: Map<String, List<String>>
) : AbstractRequest(data)

/**
 * Represents the results of processing an event. Can view if the event was a [success] or not.
 */
data class WebsocketResponse internal constructor(val success: Boolean = true)