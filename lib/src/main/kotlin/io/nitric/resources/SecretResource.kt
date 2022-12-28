package io.nitric.resources

import io.nitric.api.secrets.v0.Secrets
import io.nitric.proto.resource.v1.Action
import io.nitric.proto.resource.v1.ResourceDeclareRequest
import io.nitric.proto.resource.v1.ResourceType
import io.nitric.util.fluently
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

enum class SecretPermission {
    Put,
    Access
}

class SecretResource internal constructor(name: String): SecureResource<SecretPermission>(name) {
    override fun permissionsToActions(permissions: List<SecretPermission>): List<Action> {
        return permissions.fold(mutableListOf()) { arr, perm ->
            val actions: List<Action> = when (perm) {
                SecretPermission.Put -> listOf(Action.SecretPut)
                SecretPermission.Access -> listOf(Action.SecretAccess)
            }
            arr.addAll(actions)
            arr
        }
    }

    override fun register() = fluently {
        registerResource(this)
    }

    private fun registerResource(resource: SecretResource) = runBlocking {
        async {
            resource.client.declare(
                ResourceDeclareRequest.newBuilder()
                    .setResource(
                        io.nitric.proto.resource.v1.Resource.newBuilder().setName(resource.name)
                            .setType(ResourceType.Secret).build()
                    )
                    .setSecret(io.nitric.proto.resource.v1.SecretResource.newBuilder().build())
                    .build()
            )
        }.await()
    }

    suspend fun with(vararg permissions: SecretPermission): io.nitric.api.secrets.v0.Secret {
        this.registerPolicy(permissions.asList())
        return Secrets.secret(this.name)
    }
}