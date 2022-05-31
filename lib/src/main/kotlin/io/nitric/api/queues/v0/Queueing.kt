package io.nitric.api.queues.v0

import io.nitric.proto.queue.v1.QueueServiceGrpc
import io.nitric.proto.queue.v1.QueueServiceGrpc.QueueServiceBlockingStub
import io.nitric.util.GrpcChannelProvider

internal object Queueing {
    val client: QueueServiceBlockingStub = QueueServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())

    fun queue(name: String): Queue {
        return Queue(this.client, name)
    }
}

