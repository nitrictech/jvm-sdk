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

import io.grpc.StatusRuntimeException
import io.nitric.proto.document.v1.*
import io.nitric.proto.document.v1.DocumentServiceGrpc.DocumentServiceBlockingStub
import io.nitric.util.ProtoUtils
import kotlin.reflect.typeOf


/**
 * A reference to a specific document in a [Collection]. Created using [Collection.doc].
 */
class DocumentReference<T> internal constructor(private val client: DocumentServiceBlockingStub, val parent: Collection<T>, private val type: Class<T>, val id: String) {
    /**
     * Retrieve the contents of this document.
     */
    suspend fun get(): T? {
        val response: DocumentGetResponse
        try {
            response = this.client.get(
                DocumentGetRequest.newBuilder().setKey(this.toWire()).build()
            )
        } catch (error: StatusRuntimeException) {
            if (error.message?.startsWith("NOT_FOUND") == true) {
                return null
            } else {
                throw error
            }
        }

        if (response.hasDocument()) {
            val map = ProtoUtils.toMap(response.document.content)

            val gson = DocumentSerializer.gsonBuilder.create()
            return gson.fromJson(gson.toJsonTree(map), this.type) as T
        }

        return null
    }

    /**
     * Sets the contents of the document with [value].
     */
    suspend fun set(value: T) {
        val gson = DocumentSerializer.gsonBuilder.create()
        val json = gson.toJsonTree(value, this.type)

        val struct = ProtoUtils.toStruct(gson.fromJson(json, Map::class.java) as Map<String, Any>)

        this.client.set(
            DocumentSetRequest.newBuilder()
                .setKey(this.toWire())
                .setContent(struct).build()
        )
    }

    /**
     * Deletes the document from the collection.
     */
    suspend fun delete() {
        this.client.delete(DocumentDeleteRequest.newBuilder().setKey(this.toWire()).build())
    }

    /**
     * Creates a reference to a sub-collection within this document. Sets the [name] of the collection and the [type] of documents stored in the collection.
     */
    fun <T>collection(name: String, type: Class<T>): Collection<T> {
        if (this.depth() >= Constants.MAX_COLLECTION_DEPTH) {
            throw java.lang.IllegalArgumentException("Maximum collection depth ${Constants.MAX_COLLECTION_DEPTH} exceeded")
        }

        return Collection(this.client, name, type, this as DocumentReference<Any>?)
    }

    /**
     * Calculates the depth of the collection. Cannot exceed [Constants.MAX_COLLECTION_DEPTH]
     */
    private fun depth(): Int {
        if (this.parent.parent != null) {
            return this.parent.parent.depth() + 1
        }

        return 0
    }

    /**
     * Convert this [DocumentReference] reference to a gRPC compatible document.
     */
    internal fun toWire(): Key {
        return Key.newBuilder()
            .setCollection(this.parent.toWire())
            .setId(this.id)
            .build()
    }
}