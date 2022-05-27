package io.nitric.api.secrets.v0

import io.nitric.proto.secret.v1.SecretServiceGrpc
import io.nitric.proto.secret.v1.SecretServiceGrpc.SecretServiceBlockingStub
import io.nitric.util.GrpcChannelProvider

object Secrets {
    val client: SecretServiceBlockingStub = SecretServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())

    fun bucket(name: String): Secret {
        return Secret(this, name)
    }
}

