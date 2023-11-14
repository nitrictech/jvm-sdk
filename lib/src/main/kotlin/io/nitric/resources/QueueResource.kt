package io.nitric.resources

import io.nitric.api.queues.v0.Queue
import io.nitric.api.queues.v0.Queueing
import io.nitric.proto.resource.v1.Action
import io.nitric.proto.resource.v1.ResourceDeclareRequest
import io.nitric.proto.resource.v1.ResourceDeclareResponse
import io.nitric.proto.resource.v1.ResourceType
import io.nitric.util.fluently
import kotlinx.coroutines.*
import kotlin.coroutines.suspendCoroutine
import kotlinx.coroutines.async

enum class QueuePermission {
    Send, Receive
}

class QueueResource internal constructor(name: String): SecureResource<QueuePermission>(name, ResourceType.Queue) {
    override fun register() = fluently {
        registerResource(this)
    }

    private fun registerResource(resource: QueueResource) {
        resource.client.declare(
            ResourceDeclareRequest.newBuilder()
                .setResource(this.asProtoResource())
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

    fun with(permission: QueuePermission, vararg permissions: QueuePermission): Queue {
        val allPerms = listOf(permission) + permissions.asList()

        this.registerPolicy(allPerms)
        return Queueing.queue(this.name)
    }
}