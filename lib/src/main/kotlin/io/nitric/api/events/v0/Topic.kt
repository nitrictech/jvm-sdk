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

package io.nitric.api.events.v0

import io.nitric.proto.event.v1.EventPublishRequest
import io.nitric.util.ProtoUtils
import java.util.UUID
import io.nitric.proto.event.v1.NitricEvent as ProtoEvent

/**
 * Events represent a message delivered via Publish/Subscribe.
 * Has a unique [id] used for reprocessing, The contents of the event [payload], and the [payloadType].
 */
class NitricEvent(val payload: Map<String, Any?>, val id: String=UUID.randomUUID().toString(), val payloadType: String = "none") {
    /**
     * Converts the [NitricEvent] to a [ProtoEvent] for use with gRPC.
     */
    internal fun toWire(): ProtoEvent {
        return ProtoEvent.newBuilder()
            .setId(this.id)
            .setPayloadType(this.payloadType)
            .setPayload(ProtoUtils.toStruct(payload))
            .build()
    }
}

/**
 * Represents a reference to a topic.
 */
class Topic internal constructor(private val client: EventingClients, val name: String) {
    /**
     * Publish a new [event] to this [Topic].
     */
    fun publish(event: NitricEvent): NitricEvent {
        val resp = this.client.event.publish(
            EventPublishRequest.newBuilder()
                .setTopic(this.name)
                .setEvent(event.toWire())
                .build()
        )

        return NitricEvent(payload=event.payload, payloadType=event.payloadType, id=resp.id)
    }
}