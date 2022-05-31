package io.nitric.resources

import io.nitric.api.queues.v0.Queue
import io.nitric.api.queues.v0.Queueing
import io.nitric.proto.resource.v1.Action
import io.nitric.proto.resource.v1.ResourceDeclareRequest
import io.nitric.proto.resource.v1.ResourceType
import io.nitric.util.fluently

enum class QueuePermission {
    Send, Receive
}

class QueueResource internal constructor(name: String): SecureResource<QueuePermission>(name) {
    override fun register() = fluently {
        this.client.declare(
            ResourceDeclareRequest.newBuilder()
            .setResource(io.nitric.proto.resource.v1.Resource.newBuilder().setName(this.name).setType(ResourceType.Queue).build())
            .setQueue(io.nitric.proto.resource.v1.QueueResource.newBuilder().build()).build()
        )
    }

    override fun permissionsToActions(permissions: List<QueuePermission>): List<Action> {
        return permissions.fold(mutableListOf()) { arr, perm ->
            val actions: List<Action> = when (perm) {
                QueuePermission.Send -> listOf(Action.QueueSend)
                QueuePermission.Receive -> listOf(Action.QueueReceive)
            }

            arr.addAll(actions)

            if (arr.size > 0) {
                arr.addAll(listOf(Action.QueueDetail, Action.QueueList))
            }

            arr
        }
    }

    fun with(vararg permissions: QueuePermission): Queue {
        this.registerPolicy(permissions.asList())
        return Queueing.queue(this.name)
    }
}