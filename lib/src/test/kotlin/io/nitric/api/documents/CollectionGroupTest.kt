package io.nitric.api.documents

import io.mockk.mockk
import io.nitric.api.documents.v0.CollectionGroup
import io.nitric.api.documents.v0.Collection
import io.nitric.proto.document.v1.DocumentServiceGrpc
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class CollectionGroupTest {
    private val clientMock: DocumentServiceGrpc.DocumentServiceBlockingStub = mockk(relaxed = true)
    private val collectionMock: Collection<User> = mockk(relaxed = true)

    @Test
    fun testBuild() {
        val collection = CollectionGroup(clientMock, "test-collection", User::class.java, collectionMock)

        assertNotNull(collection)
        assertEquals("test-collection", collection.name)
        assertEquals(User::class.java, collection.type)
    }

    @Test
    fun testDoc() {
        val collection = Collection(clientMock, "test-collection", User::class.java, null)

        val newCollection = collection.collection<User>("new-collection")

        assertNotNull(newCollection)
        assertEquals("new-collection", newCollection.name)
        assertEquals(User::class.java, newCollection.type)
        assertEquals(collection, newCollection.parent)
    }

    @Test
    fun testQuery() {
        val collection = CollectionGroup(clientMock, "test-collection", User::class.java, collectionMock)

        val query = collection.query()

        assertNotNull(query)
    }

    @Test
    fun testToCollection() {
        val collection = CollectionGroup(clientMock, "test-collection", User::class.java, collectionMock)

        val convertedCollection = collection.toCollection()

        assertNotNull(convertedCollection)
        assertEquals("test-collection", convertedCollection.name)
    }

    @Test
    fun testToCollectionWithParent() {
        val parentCollection = Collection(clientMock, "parent-collection", User::class.java, null)

        val collection = CollectionGroup(clientMock, "test-collection", User::class.java, parentCollection)

        val convertedCollection = collection.toCollection()

        assertNotNull(convertedCollection)
        assertEquals("test-collection", convertedCollection.name)
        assertEquals("", convertedCollection.parent?.id)
        assertEquals("parent-collection", convertedCollection.parent?.parent?.name)
    }
}