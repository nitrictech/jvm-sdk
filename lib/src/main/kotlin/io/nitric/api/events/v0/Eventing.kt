package io.nitric.api.events.v0

import io.nitric.api.queues.v0.Queue
import io.nitric.proto.event.v1.EventServiceGrpc.EventServiceBlockingStub
import io.nitric.proto.event.v1.EventServiceGrpc
import io.nitric.proto.event.v1.TopicListRequest
import io.nitric.proto.event.v1.TopicServiceGrpc
import io.nitric.proto.event.v1.TopicServiceGrpc.TopicServiceBlockingStub
import io.nitric.util.GrpcChannelProvider

class EventingClients(val event: EventServiceBlockingStub, val topic: TopicServiceBlockingStub)

object Eventing {
    val client: EventingClients = EventingClients(
        EventServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel()),
        TopicServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())
    )

    fun topic(name: String): Topic {
        return Topic(this, name)
    }

    fun topics(): List<Topic> {
        val resp = this.client.topic.list(
            TopicListRequest.newBuilder().build()
        )
        return resp.topicsList.map { Topic(this, it.name) }
    }
}

