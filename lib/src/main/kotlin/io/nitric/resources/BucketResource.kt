package io.nitric.resources

import io.nitric.Nitric
import io.nitric.api.storage.v0.Bucket
import io.nitric.api.storage.v0.Storage
import io.nitric.faas.v0.*
import io.nitric.faas.v0.Faas
import io.nitric.faas.v0.WebsocketWorkerOptions
import io.nitric.proto.resource.v1.Action
import io.nitric.proto.resource.v1.ResourceDeclareRequest
import io.nitric.proto.resource.v1.ResourceType
import io.nitric.util.fluently
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

enum class BucketPermission {
    Read, Write, Delete
}


class BucketResource internal constructor(name: String): SecureResource<BucketPermission>(name, ResourceType.Bucket) {
    override fun register() = fluently {
        registerResource(this)
    }

    private fun registerResource(resource: BucketResource) = runBlocking {
        async {
            resource.client.declare(ResourceDeclareRequest.newBuilder()
                .setResource(resource.asProtoResource())
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

    /**
     * Create a bucket notification subscription that is triggered on a [notificationType] and filtered by a [notificationPrefixFilter].
     */
    fun on(notificationType: BucketNotificationType, notificationPrefixFilter: String, middleware: Handler<BucketNotificationContext>) {
        val faas = Faas(BucketNotificationWorkerOptions(this.name, notificationType, notificationPrefixFilter))
        faas.bucketNotification { ctx, _ -> middleware(ctx) }
        Nitric.registerWorker(faas)
    }

    /**
     * Create a bucket notification subscription that is triggered on a [notificationType] and filtered by a [notificationPrefixFilter].
     */
    fun on(notificationType: BucketNotificationType, notificationPrefixFilter: String, middleware: List<Middleware<BucketNotificationContext>>) {
        val faas = Faas(BucketNotificationWorkerOptions(this.name, notificationType, notificationPrefixFilter))
        middleware.forEach { faas.bucketNotification(it) }
        Nitric.registerWorker(faas)
    }
}

