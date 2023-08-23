// Copyright 2021, Nitric Technologies Pty Ltd.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package io.nitric.api.secrets.v0

import com.google.protobuf.ByteString
import io.nitric.proto.secret.v1.SecretPutRequest
import io.nitric.proto.secret.v1.SecretServiceGrpc.SecretServiceBlockingStub
import io.nitric.proto.secret.v1.Secret as ProtoSecret

/**
 * Represents a secret in the secrets service.
 */
class Secret internal constructor(internal val client: SecretServiceBlockingStub, val name: String) {
    fun put(secret: String): SecretVersion {
        val newSecret = this.client.put(
            SecretPutRequest.newBuilder()
                .setSecret(this.toWire())
                .setValue(ByteString.copyFromUtf8(secret))
                .build()
        )
        return SecretVersion(this, newSecret.secretVersion.version)
    }

    /**
     * Create a reference to a [SecretVersion] with a specific [version] tag.
     */
    fun version(version: String): SecretVersion {
        return SecretVersion(this, version)
    }

    /**
     * Create a reference to the latest [SecretVersion]. Will always point to the latest version.
     */
    fun latest(): SecretVersion {
        return this.version("latest")
    }

    /**
     * Convert this [Secret] to a gRPC compatible [ProtoSecret].
     */
    internal fun toWire(): ProtoSecret {
        return ProtoSecret.newBuilder()
            .setName(this.name)
            .build()
    }
}