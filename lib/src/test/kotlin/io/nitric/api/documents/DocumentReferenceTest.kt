package io.nitric.api.documents

import com.google.protobuf.Struct
import com.google.protobuf.Value
import io.mockk.coVerify
import io.mockk.every
import io.mockk.mockk
import io.nitric.api.documents.v0.Collection
import io.nitric.api.documents.v0.DocumentReference
import io.nitric.proto.document.v1.*
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class DocumentReferenceTest {
    private val clientMock: DocumentServiceGrpcKt.DocumentServiceCoroutineStub = mockk(relaxed = true)
    private val collection = Collection(clientMock, "test-collection", User::class.java, null)

    private val requestKey = Key.newBuilder().setCollection(collection.toWire()).setId("document-1234").build()
    private val userStruct = Struct.newBuilder().putAllFields(
        mapOf(
            "name" to Value.newBuilder().setStringValue("John").build(),
            "age" to Value.newBuilder().setNumberValue(21.0).build()
        ).toMutableMap()
    )

    @Test
    fun testBuild() {
        val document = DocumentReference(clientMock, collection, User::class.java, "document-1234")

        assertNotNull(document)
        assertEquals("document-1234", document.id)
        assertEquals(collection, document.parent)
    }

    @Test
    fun testGet() {
        val document = DocumentReference(clientMock, collection, User::class.java, "document-1234")

        every { runBlocking {
            clientMock.get(allAny())
        } } returns DocumentGetResponse.newBuilder()
            .setDocument(
                Document.newBuilder()
                    .setKey(requestKey)
                    .setContent(userStruct)
                    .build()
            )
            .build()

        val response = runBlocking {
            document.get()
        }

        coVerify(exactly = 1) {
            clientMock.get(
                DocumentGetRequest.newBuilder()
                    .setKey(requestKey)
                    .build(), any()
            )
        }

        assertNotNull(response)
        assertEquals("John", response.name)
        assertEquals(21, response.age)
    }

    @Test
    fun testSet() {
        val document = DocumentReference(clientMock, collection, User::class.java, "document-1234")

        runBlocking {
            document.set(User("John", 21))
        }

        coVerify(exactly = 1) {
            clientMock.set(DocumentSetRequest.newBuilder()
                .setKey(requestKey)
                .setContent(userStruct)
                .build(), any()
            )
        }
    }

    @Test
    fun testDelete() {
        val document = DocumentReference(clientMock, collection, User::class.java, "document-1234")

        runBlocking {
            document.delete()
        }

        coVerify(exactly = 1) {
            clientMock.delete(DocumentDeleteRequest.newBuilder()
                .setKey(requestKey)
                .build(), any()
            )
        }
    }

    @Test
    fun testCollection() {
        val document = DocumentReference(clientMock, collection, User::class.java, "document-1234")

        val newCol = document.collection("new-collection", User::class.java)

        assertNotNull(newCol)
        assertEquals(document, newCol.parent as DocumentReference<*>)
        assertEquals("new-collection", newCol.name)
    }

    @Test
    fun testToWire() {
        val document = DocumentReference(clientMock, collection, User::class.java, "document-1234")

        val wireDoc = document.toWire()

        assertNotNull(wireDoc)
        assertEquals("document-1234", wireDoc.id)
        assertEquals("test-collection", wireDoc.collection.name)
    }
}