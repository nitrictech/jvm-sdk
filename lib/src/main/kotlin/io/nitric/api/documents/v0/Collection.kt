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

import io.nitric.proto.document.v1.DocumentServiceGrpcKt.DocumentServiceCoroutineStub

/**
* A reference to a collection in the underlying document database.
* Is created via [CollectionGroup.collection] or [DocumentReference.collection] and is passed a [name] and the [type] of documents stored in the collection.
*/
class Collection<T> internal constructor(private val client: DocumentServiceCoroutineStub, val name: String, val type: Class<T>, val parent: DocumentReference<Any>?) {
    /**
     * Get a reference to a [DocumentReference] by its [id].
     */
    fun doc(id: String): DocumentReference<T> {
        return DocumentReference(this.client, this, this.type, id)
    }

    /**
     * Create a new [Query] builder to find [DocumentReference]s.
     */
    fun query(): Query<T> {
        return Query(this.client, this, this.type)
    }

    /**
     * Convert this [Collection] to a gRPC compatible collection.
     */
    internal fun toWire(): io.nitric.proto.document.v1.Collection {
        val protoCollection = io.nitric.proto.document.v1.Collection.newBuilder().setName(this.name)
        if (this.parent != null) {
            protoCollection.parent = this.parent.toWire()
        }
        return protoCollection.build()
    }
}