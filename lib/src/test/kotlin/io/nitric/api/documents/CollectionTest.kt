package io.nitric.api.documents

import io.mockk.mockk
import io.nitric.Nitric
import io.nitric.api.documents.v0.Documents
import io.nitric.api.documents.v0.Collection
import io.nitric.proto.document.v1.DocumentServiceGrpcKt
import io.nitric.proto.document.v1.parentOrNull
import kotlin.test.Test
import kotlin.reflect.typeOf
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

data class User(val name: String, val age: Int)

class CollectionTest {
    private val clientMock: DocumentServiceGrpcKt.DocumentServiceCoroutineStub = mockk(relaxed = true)

    @Test
    fun testBuild() {
        val collection = Collection(clientMock, "test-collection", User::class.java, null)

        assertNotNull(collection)
        assertEquals("test-collection", collection.name)
        assertEquals(User::class.java, collection.type)
        assertNull(collection.parent)
    }

    @Test
    fun testDoc() {
        val collection = Collection(clientMock, "test-collection", User::class.java, null)

        val document = collection.doc("document-1234")

        assertNotNull(document)
        assertEquals("document-1234", document.id)
        assertEquals(collection, document.parent)
    }

    @Test
    fun testQuery() {
        val collection = Collection(clientMock, "test-collection", User::class.java, null)

        val query = collection.query()

        assertNotNull(query)
    }

    @Test
    fun testToWire() {
        val collection = Collection(clientMock, "test-collection", User::class.java, null)

        val wiredCollection = collection.toWire()

        assertNotNull(wiredCollection)
        assertEquals("test-collection", wiredCollection.name)
        assertNull(wiredCollection.parentOrNull)
    }
}