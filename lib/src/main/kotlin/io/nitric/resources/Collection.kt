package io.nitric.resources

import io.nitric.api.documents.v0.Documents
import io.nitric.proto.resource.v1.*
import io.nitric.proto.resource.v1.Resource
import io.nitric.util.fluently

enum class CollectionPermission {
    Read,
    Write,
    Delete
}

class Collection<T> internal constructor(name: String, private val type: Class<T>): SecureResource<CollectionPermission>(name) {
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
        this.client.declare(ResourceDeclareRequest.newBuilder()
            .setResource(Resource.newBuilder().setName(this.name).setType(ResourceType.Collection).build())
            .setCollection(CollectionResource.newBuilder().build()).build()
        )
    }

    fun with(vararg permissions: CollectionPermission): io.nitric.api.documents.v0.Collection<T> {
        this.registerPolicy(permissions.asList())
        return Documents.collection(this.name, this.type)
    }
}