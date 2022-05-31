package io.nitric.api.storage.v0

import io.nitric.proto.storage.v1.StorageListFilesRequest
import io.nitric.proto.storage.v1.StorageServiceGrpc.StorageServiceBlockingStub

/**
 *
 */
class Bucket internal constructor(private val client: StorageServiceBlockingStub, val name: String) {
    fun files(): List<File> {
          val resp = this.client.listFiles(
            StorageListFilesRequest.newBuilder()
                .setBucketName(this.name)
                .build()
          )

        return resp.filesList.map{ f -> File(this.client, this, f.key)  }
    }

    fun file(name: String): File {
        return File(this.client, this, name)
    }
}