package io.nitric.api.queues.v0

import io.nitric.proto.queue.v1.QueueReceiveRequest
import io.nitric.proto.queue.v1.QueueSendBatchRequest
import io.nitric.proto.queue.v1.QueueSendRequest
import io.nitric.proto.queue.v1.QueueServiceGrpc
import io.nitric.proto.queue.v1.QueueServiceGrpc.QueueServiceBlockingStub

class FailedMessage internal constructor(val task: Task, val message: String )

class Queue internal constructor(private val client: QueueServiceBlockingStub, val name: String) {
    fun send(tasks: List<Task>): List<FailedMessage> {
        val resp = this.client.sendBatch(
            QueueSendBatchRequest.newBuilder()
                .setQueue(this.name)
                .addAllTasks(tasks.map { it.toWire() })
                .build()
        )
        return resp.failedTasksList.map {
            FailedMessage(
                ReceivedTask.fromWire(this.client, this, it.task),
                it.message,
            )
        }
    }
    fun send(task: Task): FailedMessage? {
        return try {
            val resp = this.client.send(
                QueueSendRequest.newBuilder()
                    .setQueue(this.name)
                    .setTask(task.toWire())
                    .build()
            )
            null
        } catch (err: Exception) {
            err.message?.let { FailedMessage(task, it) }
        }
    }

    fun receive(depth: Int = 1): List<ReceivedTask> {
        val resp = this.client.receive(
            QueueReceiveRequest.newBuilder()
                .setQueue(this.name)
                .setDepth(depth)
                .build()
        )
        return resp.tasksList.map { ReceivedTask.fromWire(this.client, this, it) }
    }
}