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

import io.nitric.proto.event.v1.EventServiceGrpcKt.EventServiceCoroutineStub
import io.nitric.proto.event.v1.TopicServiceGrpcKt.TopicServiceCoroutineStub
import io.nitric.proto.event.v1.TopicListRequest

import io.nitric.util.GrpcChannelProvider

/**
 * Event service client.
 */
internal class EventingClients internal constructor(val event: EventServiceCoroutineStub, val topic: TopicServiceCoroutineStub)

internal object Eventing {
    val client: EventingClients = EventingClients(
        EventServiceCoroutineStub(GrpcChannelProvider.getChannel()),
        TopicServiceCoroutineStub(GrpcChannelProvider.getChannel())
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
    suspend fun topics(): List<Topic> {
        val resp = this.client.topic.list(
                TopicListRequest.newBuilder().build()
        )
        return resp.topicsList.map { Topic(this.client, it.name) }
    }

    internal suspend fun topics(client: EventingClients): List<Topic> {
        val resp = client.topic.list(
            TopicListRequest.newBuilder().build()
        )
        return resp.topicsList.map { Topic(client, it.name) }
    }
}

