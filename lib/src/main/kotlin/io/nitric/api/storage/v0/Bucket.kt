package io.nitric.api.storage.v0

import io.nitric.proto.storage.v1.StorageListFilesRequest

/**
 *
 */
class Bucket(val storage: Storage, val name: String) {
    fun files(): List<File> {
          val resp = this.storage.client.listFiles(
            StorageListFilesRequest.newBuilder()
                .setBucketName(this.name)
                .build()
          )

        return resp.filesList.map{ f -> File(this.storage, this, f.key)  }
    }

    fun file(name: String): File {
        return File(this.storage, this, name)
    }
}