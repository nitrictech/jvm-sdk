package io.nitric.resources


import io.nitric.proto.resource.v1.*
import io.nitric.proto.resource.v1.ResourceServiceGrpc.ResourceServiceBlockingStub
import io.nitric.proto.resource.v1.Resource as ProtoResource
import io.nitric.util.GrpcChannelProvider

abstract class ResourceDetails(val id: String, val provider: String, val service: String)

abstract class Resource(val name: String, val type: ResourceType) {
    internal val client: ResourceServiceGrpc.ResourceServiceBlockingStub = ResourceServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())
    internal abstract fun register(): Resource

    internal fun asProtoResource(): ProtoResource {
        return ProtoResource.newBuilder().setName(this.name).setType(this.type).build()
    }
}

abstract class SecureResource<P: Enum<P>>(name: String, type: ResourceType) : Resource(name, type) {
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
            .addResources(this.asProtoResource())
            .build()

        this.client.declare(
            ResourceDeclareRequest.newBuilder()
                .setPolicy(policy)
                .setResource(policyResource)
                .build()
        )
    }
}