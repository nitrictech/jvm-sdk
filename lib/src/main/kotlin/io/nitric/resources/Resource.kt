package io.nitric.resources


import io.nitric.proto.resource.v1.*
import io.nitric.proto.resource.v1.Resource as ProtoResource
import io.nitric.util.GrpcChannelProvider

abstract class Resource(val name: String) {
    internal val client: ResourceServiceGrpcKt.ResourceServiceCoroutineStub = ResourceServiceGrpcKt.ResourceServiceCoroutineStub(GrpcChannelProvider.getChannel())
    internal abstract fun register(): Resource
}

abstract class SecureResource<P: Enum<P>>(name: String) : Resource(name) {
    internal abstract fun permissionsToActions(permissions: List<P>): List<Action>

    internal suspend fun registerPolicy(permissions: List<P>) {
        val policyResource = ProtoResource.newBuilder()
            .setType(ResourceType.Policy)
            .build()
        val defaultPrincipal = ProtoResource.newBuilder()
            .setType(ResourceType.Function)
            .build()

        val actions = this.permissionsToActions(permissions)
        val policy = PolicyResource.newBuilder()
            .addPrincipals(defaultPrincipal)
            .addAllActions(actions)
            .build()

        this.client.declare(
            ResourceDeclareRequest.newBuilder()
                .setPolicy(policy)
                .setResource(policyResource)
                .build()
        )
    }
}