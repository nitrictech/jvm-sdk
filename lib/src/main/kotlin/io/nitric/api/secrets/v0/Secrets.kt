package io.nitric.api.secrets.v0

import io.nitric.proto.secret.v1.SecretServiceGrpc
import io.nitric.proto.secret.v1.SecretServiceGrpc.SecretServiceBlockingStub
import io.nitric.util.GrpcChannelProvider

internal object Secrets {
    internal val client: SecretServiceBlockingStub = SecretServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())

    fun secret(name: String): Secret {
        return Secret(this.client, name)
    }
}

