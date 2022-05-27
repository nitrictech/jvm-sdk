package io.nitric.resources

import io.nitric.api.documents.v0.Documents
import io.nitric.proto.resource.v1.*
import io.nitric.proto.resource.v1.Resource
import io.nitric.util.fluently

enum class CollectionPermision {
    read,
    write,
    delete
}

class Collection<T> internal constructor(name: String, private val type: Class<T>): SecureResource<CollectionPermision>(name) {
    override fun permissionsToActions(permissions: List<CollectionPermision>): List<Action> {
        TODO("Not yet implemented")
    }

    override fun register() = fluently {
        this.client.declare(ResourceDeclareRequest.newBuilder()
            .setResource(Resource.newBuilder().setName(this.name).setType(ResourceType.Collection).build())
            .setCollection(CollectionResource.newBuilder().build()).build()
        )
    }

    fun with(vararg permissions: CollectionPermision): io.nitric.api.documents.v0.Collection<T> {
        this.registerPolicy(permissions.asList())
        return Documents.collection(this.name, this.type)
    }
}