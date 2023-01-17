package io.nitric.api.documents

import io.mockk.mockk
import io.nitric.api.documents.v0.CollectionGroup
import io.nitric.proto.document.v1.DocumentServiceGrpc
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class CollectionGroupTest {
    private val clientMock: DocumentServiceGrpc.DocumentServiceBlockingStub = mockk(relaxed = true)

    @Test
    fun testBuild() {
        val collection = CollectionGroup(clientMock, "test-collection", User::class.java, null)

        assertNotNull(collection)
        assertEquals("test-collection", collection.name)
        assertEquals(User::class.java, collection.type)
    }

    @Test
    fun testDoc() {
        val collection = CollectionGroup(clientMock, "test-collection", User::class.java, null)

        val newCollection = collection.collection("new-collection", User::class.java)

        assertNotNull(newCollection)
        assertEquals("new-collection", newCollection.name)
        assertEquals(User::class.java, newCollection.type)
        assertEquals(collection, newCollection.parent as CollectionGroup<*>)
    }

    @Test
    fun testQuery() {
        val collection = CollectionGroup(clientMock, "test-collection", User::class.java, null)

        val query = collection.query()

        assertNotNull(query)
    }

    @Test
    fun testToCollection() {
        val collection = CollectionGroup(clientMock, "test-collection", User::class.java, null)

        val convertedCollection = collection.toCollection()

        assertNotNull(convertedCollection)
        assertEquals("test-collection", convertedCollection.name)
        assertNull(convertedCollection.parent)
    }

    @Test
    fun testToCollectionWithParent() {
        val parentCollection = CollectionGroup(clientMock, "parent-collection", User::class.java, null)

        val collection = CollectionGroup(clientMock, "test-collection", User::class.java, parentCollection as CollectionGroup<Any>)

        val convertedCollection = collection.toCollection()

        assertNotNull(convertedCollection)
        assertEquals("test-collection", convertedCollection.name)
        assertEquals("", convertedCollection.parent?.id)
        assertEquals("parent-collection", convertedCollection.parent?.parent?.name)
    }
}