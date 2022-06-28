package io.nitric.api.documents.v0

import io.nitric.proto.document.v1.DocumentDeleteRequest
import io.nitric.proto.document.v1.DocumentGetRequest
import io.nitric.proto.document.v1.DocumentServiceGrpc.DocumentServiceBlockingStub
import io.nitric.proto.document.v1.DocumentSetRequest
import io.nitric.proto.document.v1.Key
import io.nitric.util.ProtoUtils



class DocumentReference<T> internal constructor(private val client: DocumentServiceBlockingStub, val parent: Collection<T>, private val type: Class<T>, val id: String) {
    fun get(): T? {
        val response = this.client.get(
            DocumentGetRequest.newBuilder().setKey(this.toWire()).build()
        )

        if (response.hasDocument()) {
            val map = ProtoUtils.toMap(response.document.content)

            val gson = DocumentSerializer.gsonBuilder.create()
            return gson.fromJson(gson.toJsonTree(map), this.type)
        }

        return null
    }

    fun set(value: T) {
        val gson = DocumentSerializer.gsonBuilder.create()
        val json = gson.toJsonTree(value, this.type)

        val struct = ProtoUtils.toStruct(gson.fromJson(json, Map::class.java) as Map<String, Any>)

        this.client.set(
            DocumentSetRequest.newBuilder()
                .setKey(this.toWire())
                .setContent(struct).build()
        )
    }

    fun delete() {
        this.client.delete(DocumentDeleteRequest.newBuilder().setKey(this.toWire()).build())
    }

    fun <T>collection(name: String, type: Class<T>): Collection<T> {
        if (this.depth() >= Constants.MAX_COLLECTION_DEPTH) {
            throw java.lang.IllegalArgumentException("Maximum collection depth ${Constants.MAX_COLLECTION_DEPTH} exceeded")
        }

        return Collection(this.client, name, type, this as DocumentReference<Any>?)
    }

    private fun depth(): Int {
        if (this.parent.parent != null) {
            return this.parent.parent.depth() + 1
        }

        return 0
    }

    fun toWire(): Key {
        return Key.newBuilder()
            .setCollection(parent.toWire())
            .setId(this.id)
            .build()
    }
}