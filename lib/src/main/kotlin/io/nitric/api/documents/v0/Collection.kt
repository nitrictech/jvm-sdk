package io.nitric.api.documents.v0

import io.nitric.proto.document.v1.DocumentServiceGrpc.DocumentServiceBlockingStub

class Collection<T>(private val client: DocumentServiceBlockingStub, private val name: String, private val type: Class<T>, val parent: DocumentReference<Any>?) {
    fun doc(id: String): DocumentReference<T> {
        return DocumentReference(this.client, this, this.type, id)
    }

    fun query(): Query<T> {
        return Query(this.client, this, this.type)
    }

    fun toWire(): io.nitric.proto.document.v1.Collection {
        return io.nitric.proto.document.v1.Collection.newBuilder()
            .setName(this.name)
            .setParent(this.parent?.toWire())
            .build()
    }
}