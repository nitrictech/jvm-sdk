

import io.mockk.*
import io.nitric.api.storage.v0.*
import io.nitric.proto.storage.v1.StorageServiceGrpc
import io.nitric.proto.storage.v1.StorageServiceGrpcKt.StorageServiceCoroutineStub
import org.junit.jupiter.api.TestInstance
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class BucketTest() {
    private val clientMock: StorageServiceGrpc.StorageServiceBlockingStub = mockk(relaxed = true)

    @Test
    fun testBuild() {
        val bucket = Bucket(clientMock, "test-bucket")

        assertNotNull(bucket)
        assertEquals("test-bucket", bucket.name)
    }

    @Test
    fun testFile() {
        val bucket = Bucket(clientMock, "test-bucket")

        val file = bucket.file("test-file")

        assertNotNull(file)
        assertEquals("test-file", file.name)
    }
}

