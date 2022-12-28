package io.nitric.api.storage

import io.nitric.api.storage.v0.Storage
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class StorageTest {
    @Test
    fun testCreateBucket() {
        val bucket = Storage.bucket("test-bucket")

        assertNotNull(bucket)
        assertEquals("test-bucket", bucket.name)
    }
}