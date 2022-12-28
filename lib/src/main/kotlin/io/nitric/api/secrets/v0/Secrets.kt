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

import io.nitric.proto.secret.v1.SecretServiceGrpc
import io.nitric.proto.secret.v1.SecretServiceGrpcKt.SecretServiceCoroutineStub
import io.nitric.util.GrpcChannelProvider

/**
 * The secrets service client.
 */
internal object Secrets {
    internal val client: SecretServiceCoroutineStub = SecretServiceCoroutineStub(GrpcChannelProvider.getChannel())

    /**
     * Create a reference to a specific [Secret] in the secret store by its [name].
     */
    fun secret(name: String): Secret {
        return Secret(this.client, name)
    }
}

