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

import com.google.gson.Gson
import io.nitric.proto.faas.v1.TopicResponseContext
import io.nitric.proto.faas.v1.TriggerRequest
import io.nitric.proto.faas.v1.TriggerResponse

/**
 * Represents the [req]/[resp] context for an event.
 */
data class EventContext internal constructor(override val req: EventRequest, override val resp: EventResponse): TriggerContext<EventRequest, EventResponse>() {
    companion object {
        /**
         * Construct an event topic from a trigger [request] gRPC object.
         */
        internal fun fromGrpcTriggerRequest(request: TriggerRequest): EventContext {
            val event = request.topic

            return EventContext(
                EventRequest(request.data.toByteArray(), event.topic),
                EventResponse(true)
            )
        }

        /**
         * Construct a gRPC trigger response from this [ctx].
         */
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

/**
 * Represents a message pushed to a subscriber via a [topic].
 */
class EventRequest internal constructor(data: ByteArray, val topic: String): AbstractRequest(data) {
    /**
     * Convert JSON serialized data from request into an object of a certain [type].
     */
    fun <T>json(type: Class<T>): T {
        val gson = Gson()
        return gson.fromJson(this.data.decodeToString(), type)
    }

    /**
     * Convert JSON serialized data from request into an object of a certain type.
     */
    inline fun <reified T>json(): T {
        return this.json(T::class.java)
    }
}

/**
 * Represents the results of processing an event. Can view if the event was a [success] or not.
 */
data class EventResponse internal constructor(val success: Boolean)