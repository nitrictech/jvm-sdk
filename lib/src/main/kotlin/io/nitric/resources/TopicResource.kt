package io.nitric.resources

import io.nitric.api.events.v0.Eventing
import io.nitric.api.events.v0.Topic
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
                else -> { throw Error("Unknown topic permission")}
            }
            arr.addAll(actions)
            arr
        }
    }

    fun subscribe() {
        // TODO IMPLEMENTATION
    }

    fun with(vararg permissions: TopicPermission): Topic {
        this.registerPolicy(permissions.asList())
        return Eventing.topic(this.name)
    }
}

