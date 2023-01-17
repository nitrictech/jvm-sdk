package io.nitric.resources

import io.nitric.api.storage.v0.Bucket
import io.nitric.api.storage.v0.Storage
import io.nitric.proto.resource.v1.Action
import io.nitric.proto.resource.v1.ResourceDeclareRequest
import io.nitric.proto.resource.v1.ResourceType
import io.nitric.util.fluently
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

enum class BucketPermission {
    Read, Write, Delete
}


class BucketResource internal constructor(name: String) : SecureResource<BucketPermission>(name) {
    override fun register() = fluently {
        registerResource(this)
    }

    private fun registerResource(resource: BucketResource) = runBlocking {
        async {
            resource.client.declare(ResourceDeclareRequest.newBuilder()
                .setResource(io.nitric.proto.resource.v1.Resource.newBuilder().setName(resource.name).setType(ResourceType.Bucket).build())
                .setBucket(io.nitric.proto.resource.v1.BucketResource.newBuilder().build()).build()
            )
        }.await()
    }

    override fun permissionsToActions(permissions: List<BucketPermission>): List<Action> {
        return permissions.fold(mutableListOf()) { arr, perm ->
            val actions: List<Action> = when (perm) {
                BucketPermission.Read -> listOf(Action.BucketFileGet, Action.BucketFileList)
                BucketPermission.Write -> listOf(Action.BucketFilePut)
                BucketPermission.Delete -> listOf(Action.BucketFileDelete)
            }
            arr.addAll(actions)
            arr
        }
    }

    fun with(vararg permissions: BucketPermission): Bucket {
        this.registerPolicy(permissions.asList())
        return Storage.bucket(this.name)
    }
}

