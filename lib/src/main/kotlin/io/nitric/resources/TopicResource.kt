package io.nitric.resources

import io.nitric.api.storage.v0.Bucket
import io.nitric.api.storage.v0.Storage
import io.nitric.faas.v0.Faas
import io.nitric.proto.resource.v1.Action
import io.nitric.proto.resource.v1.Resource

enum class TopicPermission {
    read, write, delete
}

class SubscriptionWorkerOptions(val topic: String)

class Subscription(val name: String) {
    init {
        val faas = Faas(SubscriptionWorkerOptions(name))
        faas.event()
    }
}

class TopicResource(name: String) : SecureResource<BucketPermission>(name) {
    protected override fun register(): Resource {
        TODO("Not yet implemented")
    }

    override fun permissionsToActions(permissions: List<BucketPermission>): List<Action> {
        return permissions.fold(mutableListOf()) { arr, perm ->
            val actions: List<Action> = when (perm.name) {
                "read" -> listOf(Action.BucketFileGet, Action.BucketFileList)
                "write" -> listOf(Action.BucketFilePut)
                "delete" -> listOf(Action.BucketFileDelete)
                else -> { throw Error("Unknown bucket permission")}
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

