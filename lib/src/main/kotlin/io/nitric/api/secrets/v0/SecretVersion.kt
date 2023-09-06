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

import io.nitric.proto.secret.v1.SecretAccessRequest
import io.nitric.proto.secret.v1.SecretVersion as ProtoSecretVersion

/**
 * A reference to a specific [version] of a [secret].
 */
class SecretVersion internal constructor(val secret: Secret, val version: String) {
    /**
     * Retrieve the value stored in this version.
     */
    fun access(): SecretValue {
        val resp = this.secret.client.access(
            SecretAccessRequest.newBuilder()
                .setSecretVersion(this.toWire())
                .build()
        )
        return SecretValue(
            this,
            resp.value.toString("utf-8")
        )
    }

    /**
     * Converts the [SecretVersion] to a gRPC compatible [ProtoSecretVersion].
     */
    private fun toWire(): ProtoSecretVersion {
        return ProtoSecretVersion.newBuilder()
            .setSecret(this.secret.toWire())
            .setVersion(this.version)
            .build()
    }
}