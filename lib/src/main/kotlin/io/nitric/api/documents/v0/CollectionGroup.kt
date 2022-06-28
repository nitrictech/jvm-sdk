package io.nitric.api.documents.v0

import io.nitric.proto.document.v1.DocumentServiceGrpc.DocumentServiceBlockingStub

/**
 *
 */
class CollectionGroup<T: Any> internal constructor(
    private val client: DocumentServiceBlockingStub,
    private val name: String,
    private val type: Class<T>,
    private val parent: CollectionGroup<Any>?
) {
    private val NIL_DOC_ID: String = "";

    fun collection(name: String, type: Class<T>): CollectionGroup<T> {
        if (this.depth() >= Constants.MAX_COLLECTION_DEPTH) {
            throw IllegalAccessException("Maximum collection depth ${Constants.MAX_COLLECTION_DEPTH} exceeded")
        }
        return CollectionGroup(this.client, name, type, this as CollectionGroup<Any>)
    }

    fun query(): Query<T> {
        return Query(this.client, this.toCollection(), this.type)
    }

    fun depth(): Int {
        if (this.parent != null) {
            return this.parent.depth() + 1
        }

        return 0
    }

    private fun toCollection(): Collection<T> {
        if (this.parent != null) {
            return Collection(this.client, this.name, this.type, DocumentReference(this.client, this.parent.toCollection(), this.parent.type, NIL_DOC_ID))
        }

        return Collection(this.client, this.name, this.type,null)
    }
}