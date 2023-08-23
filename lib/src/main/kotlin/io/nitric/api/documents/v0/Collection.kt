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

import io.nitric.proto.document.v1.DocumentServiceGrpc.DocumentServiceBlockingStub

/**
* A reference to a collection in the underlying document database.
* Is created via [collection] or [DocumentReference.collection] and is passed a [name] and the [type] of documents stored in the collection.
*/
class Collection<T> internal constructor(private val client: DocumentServiceBlockingStub, val name: String, val type: Class<T>, val parent: DocumentReference<*>?) {
    /**
     * Get a reference to a [DocumentReference] by its [id].
     */
    fun doc(id: String): DocumentReference<T> {
        if (this.depth() >= Constants.MAX_COLLECTION_DEPTH) {
            throw IllegalAccessException("Maximum collection depth of ${Constants.MAX_COLLECTION_DEPTH} exceeded")
        }
        return DocumentReference(this.client, this, this.type, id)
    }

    /**
     * Get a reference to a sub-collection.
     */
    fun <U>collection(name: String, type: Class<U>): CollectionGroup<U> {
        if (this.depth() >= Constants.MAX_COLLECTION_DEPTH) {
            throw IllegalAccessException("Maximum collection depth of ${Constants.MAX_COLLECTION_DEPTH} exceeded")
        }
        return CollectionGroup(this.client, name, type, this)
    }

    inline fun <reified U>collection(name: String): CollectionGroup<U> {
        return this.collection(name, U::class.java)
    }

    fun depth(): Int {
        if (this.parent == null) {
            return 0
        }
        return 1
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