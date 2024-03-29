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
 * Represents a group of collections, used to search for documents across multiple collections.
 *
 * This is typically used to search all sub-collections below docs in a single parent collection.
 *
 * E.g. search all cities in all states. The group of sub-subcollections are expected to have the same name (e.g. "cities")
 *
 * Is only created via [Documents.collection] and is passed a [name] and the [type] of documents stored in the collection.
 */
class CollectionGroup<T> internal constructor(
    private val client: DocumentServiceBlockingStub,
    val name: String,
    val type: Class<T>,
    val parent: Collection<*>
) {
    private val NIL_DOC_ID: String = "";

    /**
     * Create a new [Query] builder to find [DocumentReference]s.
     */
    fun query(): Query<T> {
        return Query(this.client, this.toCollection(), this.type)
    }

    /**
     * Converts this [CollectionGroup] to a [Collection]
     */
    internal fun toCollection(): Collection<T> {
        return Collection(this.client, this.name, this.type, DocumentReference(this.client, this.parent, this.parent.type, NIL_DOC_ID))
    }
}