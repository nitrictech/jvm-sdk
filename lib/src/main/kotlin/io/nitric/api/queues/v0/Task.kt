package io.nitric.api.queues.v0

import com.google.protobuf.Struct
import com.google.protobuf.Value
import io.nitric.proto.queue.v1.NitricTask
import io.nitric.proto.queue.v1.QueueCompleteRequest
import io.nitric.util.ProtoUtils
import kotlin.collections.Map

abstract class Task(
    val id: String,
    val leaseId: String,
    val payloadType: String?,
    val payload: Map<String, String>?) {

    fun toWire(): NitricTask {
        val struct = Struct.newBuilder()
        payload?.forEach { property ->
            struct.putFields(property.key, Value.parseFrom(property.value.toByteArray()))
        }
        return NitricTask.newBuilder()
            .setPayload(struct.build())
            .setPayloadType(payloadType)
            .build()
    }
}

class ReceivedTask(val queue: Queue, id: String, leaseId: String, payloadType: String?, payload: Map<String, String>?) : Task(id, leaseId, payloadType,
    payload
) {
    fun complete() {
        this.queue.queueing.client.complete(
            QueueCompleteRequest.newBuilder()
                .setQueue(this.queue.name)
                .setLeaseId(this.leaseId)
                .build()
        )
    }

    companion object {
        @JvmStatic
        fun fromWire(queue: Queue, nitricTask: NitricTask): ReceivedTask
        {
            return ReceivedTask(
                queue,
                nitricTask.id,
                nitricTask.leaseId,
                nitricTask.payloadType,
                ProtoUtils.toMap(nitricTask.payload)?.map { it.key.toString() to it.value.toString() }?.toMap()
            )
        }
    }
}