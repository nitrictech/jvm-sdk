package io.nitric.api.storage

import com.google.protobuf.ByteString
import io.mockk.coVerify
import io.mockk.mockk
import io.nitric.api.storage.v0.File
import io.nitric.api.storage.v0.Bucket
import io.nitric.proto.storage.v1.StorageDeleteRequest
import io.nitric.proto.storage.v1.StoragePreSignUrlRequest
import io.nitric.proto.storage.v1.StorageReadRequest
import io.nitric.proto.storage.v1.StorageServiceGrpc
import io.nitric.proto.storage.v1.StorageServiceGrpcKt
import io.nitric.proto.storage.v1.StorageWriteRequest
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class FileTest() {
    private val clientMock: StorageServiceGrpc.StorageServiceBlockingStub = mockk(relaxed = true)
    private val bucket = Bucket(clientMock, "test-bucket")
    private val file = File(bucket, "file")

    @Test
    fun testWrite() {
        runBlocking {
            file.write("body")
        }

        coVerify(exactly = 1) {
            clientMock.write(
                StorageWriteRequest.newBuilder()
                    .setBucketName("test-bucket")
                    .setBody(ByteString.copyFrom("body".toByteArray()))
                    .setKey("file")
                    .build()
            )
        }
    }

    @Test
    fun testWriteBytes() {
        val bytes = "bytes".toByteArray()

        runBlocking {
            file.write(bytes)
        }

        coVerify(exactly = 1) {
            clientMock.write(
                StorageWriteRequest.newBuilder()
                    .setBucketName("test-bucket")
                    .setBody(ByteString.copyFrom(bytes))
                    .setKey("file")
                    .build()
            )
        }
    }

    @Test
    fun testDownloadURL() {
        runBlocking {
            file.getDownloadUrl()
        }

        coVerify(exactly = 1) {
            clientMock.preSignUrl(
                StoragePreSignUrlRequest.newBuilder()
                    .setBucketName("test-bucket")
                    .setExpiry(600)
                    .setKey("file")
                    .setOperation(StoragePreSignUrlRequest.Operation.READ)
                    .build()
            )
        }
    }

    @Test
    fun testUploadURL() {
        runBlocking {
            file.getUploadUrl()
        }

        coVerify(exactly = 1) {
            clientMock.preSignUrl(
                StoragePreSignUrlRequest.newBuilder()
                    .setBucketName("test-bucket")
                    .setExpiry(600)
                    .setKey("file")
                    .setOperation(StoragePreSignUrlRequest.Operation.WRITE)
                    .build()
            )
        }
    }

    @Test
    fun testDownloadURLWithExpiry() {
        runBlocking {
            file.getDownloadUrl(100)
        }

        coVerify(exactly = 1) {
            clientMock.preSignUrl(
                StoragePreSignUrlRequest.newBuilder()
                    .setBucketName("test-bucket")
                    .setExpiry(100)
                    .setKey("file")
                    .setOperation(StoragePreSignUrlRequest.Operation.READ)
                    .build()
            )
        }
    }

    @Test
    fun testUploadURLWithExpiry() {
        runBlocking {
            file.getUploadUrl(100)
        }

        coVerify(exactly = 1) {
            clientMock.preSignUrl(
                StoragePreSignUrlRequest.newBuilder()
                    .setBucketName("test-bucket")
                    .setExpiry(100)
                    .setKey("file")
                    .setOperation(StoragePreSignUrlRequest.Operation.WRITE)
                    .build()
            )
        }
    }

    @Test
    fun testRead() {
        runBlocking {
            file.read()
        }

        coVerify(exactly = 1) {
            clientMock.read(
                StorageReadRequest.newBuilder()
                    .setBucketName("test-bucket")
                    .setKey("file")
                    .build()
            )
        }
    }

    @Test
    fun testDelete() {
        runBlocking {
            file.delete()
        }

        coVerify(exactly = 1) {
            clientMock.delete(
                StorageDeleteRequest.newBuilder()
                    .setBucketName("test-bucket")
                    .setKey("file")
                    .build()
            )
        }
    }

}