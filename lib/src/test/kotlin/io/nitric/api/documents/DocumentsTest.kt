package io.nitric.api.documents

import io.nitric.api.documents.v0.Documents
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class DocumentsTest {
    @Test
    fun testBuild() {
        val collection = Documents.collection("test-collection", User::class.java)

        assertNotNull(collection)
        assertEquals("test-collection", collection.name)
        assertEquals(User::class.java, collection.type)
    }
}