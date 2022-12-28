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

import io.nitric.proto.queue.v1.QueueReceiveRequest
import io.nitric.proto.queue.v1.QueueSendBatchRequest
import io.nitric.proto.queue.v1.QueueSendRequest
import io.nitric.proto.queue.v1.QueueServiceGrpcKt.QueueServiceCoroutineStub
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * Represents a [Task] that was unable to be sent to a queue. Contains the [task] that failed to be sent and the error [message].
 */
class FailedTask internal constructor(val task: Task, val message: String )

/**
 * A reference to a queue in the queues service.
 */
class Queue internal constructor(internal val client: QueueServiceCoroutineStub, var name: String) {
    /**
     * Send a list of [tasks] to this [Queue].
     */
    suspend fun send(tasks: List<Task>): List<FailedTask> {
        val resp = this.client.sendBatch(
            QueueSendBatchRequest.newBuilder()
                .setQueue(this.name)
                .addAllTasks(tasks.map { it.toWire() })
                .build()
        )


        return resp.failedTasksList.map {
            FailedTask(
                ReceivedTask.fromWire( this, it.task),
                it.message,
            )
        }
    }

    /**
     * Send a [task] to this Queue.
     */
    suspend fun send(task: Task): FailedTask? {
        return try {
            this.client.send(
                QueueSendRequest.newBuilder()
                    .setQueue(this.name)
                    .setTask(task.toWire())
                    .build()
            )
            null
        } catch (err: Exception) {
            err.message?.let { FailedTask(task, it) }
        }
    }

    /**
     * Gets a list of [ReceivedTask] from the [Queue] to process.
     *
     * The number of [ReceivedTask]s returned will be the less than or equal to the requested [depth], based on the number of [Task]s on the [Queue].
     */
    suspend fun receive(depth: Int = 1): List<ReceivedTask> {
        val resp = this.client.receive(
            QueueReceiveRequest.newBuilder()
                .setQueue(this.name)
                .setDepth(depth)
                .build()
        )

        return resp.tasksList.map { ReceivedTask.fromWire(this, it) }
    }
}