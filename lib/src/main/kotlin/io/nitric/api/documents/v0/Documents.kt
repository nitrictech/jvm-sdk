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

package io.nitric.api.documents.v0

import io.nitric.proto.document.v1.DocumentServiceGrpc
import io.nitric.util.GrpcChannelProvider

internal object Documents {
    // The document gRPC client
    private val client = DocumentServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())

    /**
     * Create a [Collection] with a [name] and the [type] of documents in the collection.
     */
    fun <T>collection(name: String, type: Class<T>): Collection<T> {
        return Collection(client, name, type, null)
    }
}