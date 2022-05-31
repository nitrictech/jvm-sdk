package io.nitric.api.secrets.v0

import com.google.protobuf.ByteString
import io.nitric.proto.secret.v1.SecretPutRequest
import io.nitric.proto.secret.v1.SecretServiceGrpc.SecretServiceBlockingStub
import io.nitric.proto.secret.v1.Secret as ProtoSecret

class Secret(internal val client: SecretServiceBlockingStub, val name: String) {
    fun put(secret: String) {
        this.client.put(
            SecretPutRequest.newBuilder()
                .setSecret(this.toWire())
                .setValue(ByteString.copyFromUtf8(secret))
                .build()
        )
    }

    fun version(version: String): SecretVersion {
        return SecretVersion(this, version)
    }

    fun latest(): SecretVersion {
        return this.version("latest")
    }

    fun toWire(): ProtoSecret {
        return ProtoSecret.newBuilder()
            .setName(this.name)
            .build()
    }
}