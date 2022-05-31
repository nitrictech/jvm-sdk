package io.nitric.api.events.v0

import com.google.protobuf.Struct
import com.google.protobuf.Value
import io.nitric.proto.event.v1.EventPublishRequest
import io.nitric.util.ProtoUtils
import io.nitric.proto.event.v1.NitricEvent as ProtoEvent

class NitricEvent(val id: String, val payloadType: String = "none", val payload: Map<String, Any?>) {
    fun toWire(): ProtoEvent {
        return ProtoEvent.newBuilder()
            .setId(this.id)
            .setPayloadType(this.payloadType)
            .setPayload(ProtoUtils.toStruct(payload))
            .build()
    }
}

class Topic(val eventing: Eventing, val name: String) {
    fun publish(event: NitricEvent): NitricEvent {
        val resp = this.eventing.client.event.publish(
            EventPublishRequest.newBuilder()
                .setEvent(event.toWire())
                .build()
        )

        return NitricEvent(resp.id, event.payloadType, event.payload)
    }
}