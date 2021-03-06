package io.nitric.api.documents.v0

class DocumentSnapshot<T> internal constructor(val ref: DocumentReference<T>, val content: T) {
    fun getId(): String {
        return this.ref.id
    }
}