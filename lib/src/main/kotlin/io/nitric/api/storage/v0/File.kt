package io.nitric.api.storage.v0

import com.google.protobuf.ByteString
import io.nitric.proto.storage.v1.StorageListFilesRequest
import io.nitric.proto.storage.v1.StoragePreSignUrlRequest
import io.nitric.proto.storage.v1.StorageReadRequest
import io.nitric.proto.storage.v1.StorageServiceGrpc.StorageServiceBlockingStub;
import io.nitric.proto.storage.v1.StorageWriteRequest

enum class FileMode {
    Read, Write
}

class File(val storage: Storage, val bucket: Bucket, val name: String) {
    fun getDownloadUrl(expiry: Int = 600): String  {
        return this.signUrl(FileMode.Read, expiry)
    }

    fun getUploadUrl(expiry: Int = 600): String {
        return this.signUrl(FileMode.Write, expiry)
    }

    private fun signUrl(mode: FileMode, expiry: Int = 600): String {
        val resp = this.storage.client.preSignUrl(
            StoragePreSignUrlRequest.newBuilder()
                .setBucketName(this.bucket.name)
                .setKey(this.name)
                .setExpiry(expiry)
                .setOperation(StoragePreSignUrlRequest.Operation.forNumber(mode.ordinal))
                .build()
        )
        return resp.url
    }

    fun write(body: String) {
        val resp = this.storage.client.write(
            StorageWriteRequest.newBuilder()
                .setBucketName(this.bucket.name)
                .setKey(this.name)
                .setBody(ByteString.copyFromUtf8(body))
                .build()

        )
    }

    fun write(body: ByteArray) {
        val resp = this.storage.client.write(
            StorageWriteRequest.newBuilder()
                .setBucketName(this.bucket.name)
                .setKey(this.name)
                .setBody(ByteString.copyFrom(body))
                .build()

        )
    }

    fun read(): ByteArray {
        val resp = this.storage.client.read(
            StorageReadRequest.newBuilder()
                .setBucketName(this.bucket.name)
                .setKey(this.name)
                .build()
        )

        return resp.body.toByteArray()
    }
}