package io.nitric.resources

import io.nitric.api.documents.v0.Documents
import io.nitric.proto.resource.v1.*
import io.nitric.proto.resource.v1.Resource
import io.nitric.util.fluently
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

enum class CollectionPermission {
    Read,
    Write,
    Delete
}

class CollectionResource<T> internal constructor(name: String, private val type: Class<T>): SecureResource<CollectionPermission>(name) {
    override fun permissionsToActions(permissions: List<CollectionPermission>): List<Action> {
        return permissions.fold(mutableListOf()) { arr, perm ->
            val actions: List<Action> = when (perm) {
                CollectionPermission.Read -> listOf(Action.CollectionDocumentRead)
                CollectionPermission.Write -> listOf(Action.CollectionDocumentWrite)
                CollectionPermission.Delete -> listOf(Action.CollectionDocumentDelete)
            }
            arr.addAll(actions)
            arr
        }
    }

    override fun register() = fluently {
        registerResource(this)
    }

    private fun registerResource(resource: CollectionResource<T>) = runBlocking {
        resource.client.declare(ResourceDeclareRequest.newBuilder()
            .setResource(Resource.newBuilder().setName(resource.name).setType(ResourceType.Collection).build())
            .setCollection(io.nitric.proto.resource.v1.CollectionResource.newBuilder().build()).build()
        )
    }

    suspend fun with(vararg permissions: CollectionPermission): io.nitric.api.documents.v0.Collection<T> {
        this.registerPolicy(permissions.asList())
        return Documents.collection(this.name, this.type)
    }
}