package io.nitric.api.events.v0

import io.nitric.api.queues.v0.Queue
import io.nitric.proto.event.v1.EventServiceGrpc.EventServiceBlockingStub
import io.nitric.proto.event.v1.EventServiceGrpc
import io.nitric.proto.event.v1.TopicListRequest
import io.nitric.proto.event.v1.TopicServiceGrpc
import io.nitric.proto.event.v1.TopicServiceGrpc.TopicServiceBlockingStub
import io.nitric.util.GrpcChannelProvider

internal class EventingClients internal constructor(val event: EventServiceBlockingStub, val topic: TopicServiceBlockingStub)

internal object Eventing {
    val client: EventingClients = EventingClients(
        EventServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel()),
        TopicServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())
    )

    fun topic(name: String): Topic {
        return Topic(this.client, name)
    }

//    fun topics(): List<Topic> {
//        val resp = this.client.topic.list(
//            TopicListRequest.newBuilder().build()
//        )
//        return resp.topicsList.map { Topic(this.client, it.name) }
//    }
}

