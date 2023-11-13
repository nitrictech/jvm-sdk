package io.nitric.resources

import io.nitric.api.secrets.v0.Secrets
import io.nitric.proto.resource.v1.Action
import io.nitric.proto.resource.v1.ResourceDeclareRequest
import io.nitric.proto.resource.v1.ResourceType
import io.nitric.util.fluently

enum class SecretPermission {
    Put,
    Access
}

class SecretResource internal constructor(name: String): SecureResource<SecretPermission>(name, ResourceType.Secret) {
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

    private fun registerResource(resource: SecretResource) {
        resource.client.declare(
            ResourceDeclareRequest.newBuilder()
                .setResource(this.asProtoResource())
                .setSecret(io.nitric.proto.resource.v1.SecretResource.newBuilder().build())
                .build()
        )
    }

    fun with(permission: SecretPermission, vararg permissions: SecretPermission): io.nitric.api.secrets.v0.Secret {
        val allPerms = listOf(permission) + permissions.asList()

        this.registerPolicy(allPerms)
        return Secrets.secret(this.name)
    }
}