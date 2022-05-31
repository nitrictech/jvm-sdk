package io.nitric.resources

import io.nitric.Nitric
import io.nitric.api.events.v0.Eventing
import io.nitric.api.events.v0.Topic
import io.nitric.faas.v0.*
import io.nitric.faas.v0.Faas
import io.nitric.proto.resource.v1.Action
import io.nitric.proto.resource.v1.Resource
import io.nitric.proto.resource.v1.ResourceDeclareRequest
import io.nitric.proto.resource.v1.ResourceType
import io.nitric.util.fluently

enum class TopicPermission {
    Publishing
}

class TopicResource(name: String) : SecureResource<TopicPermission>(name) {
    override fun register() = fluently {
        this.client.declare(ResourceDeclareRequest.newBuilder()
            .setResource(Resource.newBuilder().setName(this.name).setType(ResourceType.Topic).build())
            .setTopic(io.nitric.proto.resource.v1.TopicResource.newBuilder().build())
            .build()
        )
    }

    override fun permissionsToActions(permissions: List<TopicPermission>): List<Action> {
        return permissions.fold(mutableListOf()) { arr, perm ->
            val actions: List<Action> = when (perm) {
                TopicPermission.Publishing -> listOf(Action.TopicEventPublish, Action.TopicList, Action.TopicDetail)
            }
            arr.addAll(actions)
            arr
        }
    }

    fun subscribe(mw: Middleware<EventContext>) {
        val faas = Faas(SubscriptionWorkerOptions(this.name))
        faas.event(mw)
        Nitric.registerWorker(faas)
    }

    fun with(vararg permissions: TopicPermission): Topic {
        this.registerPolicy(permissions.asList())
        return Eventing.topic(this.name)
    }
}

