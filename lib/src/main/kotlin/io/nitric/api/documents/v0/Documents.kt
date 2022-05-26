package io.nitric.api.documents.v0

import io.nitric.proto.document.v1.DocumentServiceGrpc
import io.nitric.proto.document.v1.DocumentServiceGrpc.DocumentServiceBlockingStub
import io.nitric.util.GrpcChannelProvider

object Documents {
    private val client: DocumentServiceBlockingStub = DocumentServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())

    fun <T>collection(name: String, type: Class<T>): Collection<T> {
        return Collection(client, name, type, null)
    }
}