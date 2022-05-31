package io.nitric.faas.v0

import io.nitric.proto.faas.v1.TopicResponseContext
import io.nitric.proto.faas.v1.TriggerRequest
import io.nitric.proto.faas.v1.TriggerResponse

data class EventContext(override val req: EventRequest, override val resp: EventResponse): TriggerContext<EventRequest, EventResponse>() {
    companion object {
        internal fun fromGrpcTriggerRequest(req: TriggerRequest): EventContext {
            val event = req.topic

            return EventContext(
                EventRequest(req.data.toByteArray(), event.topic),
                EventResponse(true)
            )
        }

        internal fun toGrpcTriggerResponse(ctx: EventContext): TriggerResponse {
            return TriggerResponse.newBuilder()
                .setTopic(TopicResponseContext.newBuilder()
                    .setSuccess(ctx.resp.success)
                    .build()
                )
                .build()
        }
    }
}

class EventRequest(data: ByteArray, val topic: String): AbstractRequest(data) {}

data class EventResponse(val success: Boolean)