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

package io.nitric.api.storage.v0

import com.google.protobuf.ByteString
import io.nitric.proto.storage.v1.StorageDeleteRequest
import io.nitric.proto.storage.v1.StoragePreSignUrlRequest
import io.nitric.proto.storage.v1.StorageReadRequest
import io.nitric.proto.storage.v1.StorageServiceGrpcKt.StorageServiceCoroutineStub
import io.nitric.proto.storage.v1.StorageWriteRequest

/**
 * The access mode of the file. Either [Read] or [Write].
 */
enum class FileMode {
    Read, Write
}

/**
 * A reference to a specific file in a [Bucket]
 */
class File internal constructor(val bucket: Bucket, val name: String) {
    /**
     * Get a signed URL for downloading from the bucket. Optional [expiry] seconds can be added, defaults to 600 seconds.
     */
    fun getDownloadUrl(expiry: Int = 600): String  {
        return this.signUrl(FileMode.Read, expiry)
    }

    /**
     * Get a signed URL for uploading to the bucket. Optional [expiry] seconds can be added, defaults to 600 seconds.
     */
    fun getUploadUrl(expiry: Int = 600): String {
        return this.signUrl(FileMode.Write, expiry)
    }

    /**
     * Sign the URL with a particular [mode] and [expiry].
     */
    private fun signUrl(mode: FileMode, expiry: Int = 600): String {
        val resp = this.bucket.client.preSignUrl(
            StoragePreSignUrlRequest.newBuilder()
                .setBucketName(this.bucket.name)
                .setKey(this.name)
                .setExpiry(expiry)
                .setOperation(StoragePreSignUrlRequest.Operation.forNumber(mode.ordinal))
                .build()
        )
        return resp.url
    }

    /**
     * Create or update the [body] of the [File].
     */
    fun write(body: String) {
        val resp = this.bucket.client.write(
            StorageWriteRequest.newBuilder()
                .setBucketName(this.bucket.name)
                .setKey(this.name)
                .setBody(ByteString.copyFromUtf8(body))
                .build()

        )
    }

    /**
     * Create or update the [body] of the [File].
     */
    fun write(body: ByteArray) {
        this.bucket.client.write(
            StorageWriteRequest.newBuilder()
                .setBucketName(this.bucket.name)
                .setKey(this.name)
                .setBody(ByteString.copyFrom(body))
                .build()
        )
    }

    /**
     * Retrieve the contents of the [File] as bytes.
     */
    fun read(): ByteArray {
        val resp = this.bucket.client.read(
            StorageReadRequest.newBuilder()
                .setBucketName(this.bucket.name)
                .setKey(this.name)
                .build()
        )

        return resp.body.toByteArray()
    }

    /**
     * Delete the [File].
     */
    fun delete() {
        this.bucket.client.delete(
                StorageDeleteRequest.newBuilder()
                        .setBucketName(this.bucket.name)
                        .setKey(this.name)
                        .build()
        )
    }
}