package io.nitric.resources


import io.nitric.proto.resource.v1.Action
import io.nitric.proto.resource.v1.PolicyResource
import io.nitric.proto.resource.v1.Resource as ProtoResource
import io.nitric.proto.resource.v1.ResourceDeclareRequest
import io.nitric.proto.resource.v1.ResourceServiceGrpc
import io.nitric.proto.resource.v1.ResourceType
import io.nitric.util.GrpcChannelProvider

abstract class Resource(val name: String) {
    internal val client: ResourceServiceGrpc.ResourceServiceBlockingStub = ResourceServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())
    internal abstract fun register(): Resource
}

abstract class SecureResource<P: Enum<P>>(name: String) : Resource(name) {
    internal abstract fun permissionsToActions(permissions: List<P>): List<Action>

    internal fun registerPolicy(permissions: List<P>) {
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