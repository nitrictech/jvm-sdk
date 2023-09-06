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

package io.nitric.api.queues.v0

import com.google.protobuf.Value
import com.google.protobuf.Struct
import io.nitric.proto.queue.v1.NitricTask
import io.nitric.proto.queue.v1.QueueCompleteRequest
import io.nitric.util.ProtoUtils
import java.util.*
import kotlin.collections.Map

/**
 * Represents a message to be delivered via a Queue. Has a unique [id], the contents of the [payload], and the [payloadType].
 * Also has a unique [leaseId] for completing [Task]s.
 */
open class Task internal constructor(
    val payload: Map<String, Any?>?,
    val id: String = UUID.randomUUID().toString(),
    val leaseId: String = UUID.randomUUID().toString(),
    val payloadType: String? = "none"
    ) {

    /**
     * Converts this [Task] to a gRPC compatible [NitricTask].
     */
    internal fun toWire(): NitricTask {
        val struct = Struct.newBuilder()

        payload?.forEach { property ->
            val value = Value.newBuilder()
            when (property.value) {
                is String -> value.stringValue = property.value as String
                is Number -> value.numberValue = property.value.toString().toDouble()
                is Boolean -> value.boolValue = property.value as Boolean
                else -> value.stringValue = property.value.toString()
            }

            struct.putFields(property.key, value.build())
        }

        return NitricTask.newBuilder()
            .setId(this.id)
            .setPayload(struct.build())
            .setPayloadType(this.payloadType)
            .setLeaseId(this.leaseId)
            .build()
    }
}

/**
 * Represents a [Task] received locally for processing.
 *
 * Since [ReceivedTask]s are on a limited time lease they include a [leaseId].
 * Received tasks must be completed via [ReceivedTask.complete] to be removed from the [queue] and avoid reprocessing.
 */
class ReceivedTask internal constructor(
    private val queue: Queue,
    id: String,
    leaseId: String,
    payloadType: String?,
    payload: Map<String, Any?>?
) : Task(payload=payload, id=id, leaseId=leaseId, payloadType=payloadType) {
    /**
     * Complete this [ReceivedTask] and remove it from the source [Queue].
     */
    fun complete() {
        this.queue.client.complete(
            QueueCompleteRequest.newBuilder()
                .setQueue(this.queue.name)
                .setLeaseId(this.leaseId)
                .build()
        )
    }

    companion object {
        /**
         * Converts a [NitricTask] to a [ReceivedTask].
         */
        internal fun fromWire(queue: Queue, nitricTask: NitricTask): ReceivedTask
        {
            return ReceivedTask(
                queue,
                nitricTask.id,
                nitricTask.leaseId,
                nitricTask.payloadType,
                ProtoUtils.toMap(nitricTask.payload).map { it.key to it.value.toString() }.toMap()
            )
        }
    }
}