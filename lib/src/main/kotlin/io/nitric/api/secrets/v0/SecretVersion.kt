package io.nitric.api.secrets.v0

import io.nitric.proto.secret.v1.SecretAccessRequest
import io.nitric.proto.secret.v1.SecretVersion as ProtoSecretVersion

class SecretVersion(val secret: Secret, val version: String) {
    fun access(): SecretValue {
        val resp = this.secret.secrets.client.access(
            SecretAccessRequest.newBuilder()
                .setSecretVersion(this.toWire())
                .build()
        )
        return SecretValue(
            this,
            resp.value.toString("utf-8")
        )
    }

    private fun toWire(): ProtoSecretVersion {
        return ProtoSecretVersion.newBuilder()
            .setSecret(this.secret.toWire())
            .setVersion(this.version)
            .build()
    }
}