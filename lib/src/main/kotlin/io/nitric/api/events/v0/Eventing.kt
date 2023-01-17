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

import io.grpc.stub.AbstractBlockingStub
import io.nitric.proto.event.v1.EventServiceGrpc
import io.nitric.proto.event.v1.EventServiceGrpc.EventServiceBlockingStub
import io.nitric.proto.event.v1.TopicServiceGrpc.TopicServiceBlockingStub
import io.nitric.proto.event.v1.TopicListRequest
import io.nitric.proto.event.v1.TopicServiceGrpc

import io.nitric.util.GrpcChannelProvider

/**
 * Event service client.
 */
internal class EventingClients internal constructor(val event: EventServiceBlockingStub, val topic: TopicServiceBlockingStub)

internal object Eventing {
    val client: EventingClients = EventingClients(
        EventServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel()),
        TopicServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())
    )

    /**
     * Creates a reference to a [Topic] by its [name].
     */
    fun topic(name: String): Topic {
        return Topic(this.client, name)
    }

    /**
     * Return a list of all accessible [Topic]s.
     */
    fun topics(): List<Topic> {
        val resp = this.client.topic.list(
                TopicListRequest.newBuilder().build()
        )
        return resp.topicsList.map { Topic(this.client, it.name) }
    }

    internal fun topics(client: EventingClients): List<Topic> {
        val resp = client.topic.list(
            TopicListRequest.newBuilder().build()
        )
        return resp.topicsList.map { Topic(client, it.name) }
    }
}

