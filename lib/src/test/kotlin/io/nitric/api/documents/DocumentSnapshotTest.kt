package io.nitric.api.documents

import io.mockk.mockk
import io.nitric.proto.document.v1.DocumentServiceGrpcKt
import io.nitric.api.documents.v0.Collection
import io.nitric.api.documents.v0.DocumentReference
import io.nitric.api.documents.v0.DocumentSnapshot
import io.nitric.proto.document.v1.DocumentServiceGrpc
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class DocumentSnapshotTest {
    private val clientMock: DocumentServiceGrpc.DocumentServiceBlockingStub = mockk(relaxed = true)
    private val collection = Collection(clientMock, "test-collection", User::class.java, null)
    private val docRef = DocumentReference(clientMock, collection, User::class.java, "document-1234")

    @Test
    fun testBuild() {
        val snapshot = DocumentSnapshot(docRef, User("John", 21))

        assertNotNull(snapshot)
        assertEquals("document-1234", snapshot.getId())
        assertEquals("John", snapshot.content.name)
        assertEquals(21, snapshot.content.age)
    }
}