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
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

enum class TopicPermission {
    Publishing
}

class TopicResource internal constructor(name: String) : SecureResource<TopicPermission>(name, ResourceType.Topic) {
    override fun register() = fluently {
        registerResource(this)
    }

    private fun registerResource(resource: TopicResource) {
        resource.client.declare(
            ResourceDeclareRequest.newBuilder()
                .setResource(this.asProtoResource())
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

    /**
     * Subscribe to a topic, running [middleware] on each publish.
     */
    fun subscribe(middleware: Handler<EventContext>) {
        val faas = Faas(SubscriptionWorkerOptions(this.name))
        faas.event { ctx, next ->
            val context = middleware(ctx)
            next(context)
        }
        Nitric.registerWorker(faas)
    }


    /**
     * Subscribe to a topic, running [middleware] on each publish.
     */
    fun subscribe(middleware: List<Middleware<EventContext>>) {
        val faas = Faas(SubscriptionWorkerOptions(this.name))
        middleware.forEach {
            faas.event(it)
        }
        Nitric.registerWorker(faas)
    }

    fun with(permission: TopicPermission, vararg permissions: TopicPermission): Topic {
        val allPerms = listOf(permission) + permissions.asList()

        this.registerPolicy(allPerms)
        return Eventing.topic(this.name)
    }
}

