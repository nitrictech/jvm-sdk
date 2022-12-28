package io.nitric.api.documents

import io.mockk.coVerify
import io.mockk.mockk
import io.nitric.api.documents.v0.Collection
import io.nitric.api.documents.v0.Operator
import io.nitric.proto.document.v1.DocumentQueryRequest
import io.nitric.proto.document.v1.DocumentServiceGrpcKt.DocumentServiceCoroutineStub
import io.nitric.proto.document.v1.Expression
import io.nitric.proto.document.v1.ExpressionValue
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import org.junit.jupiter.api.TestInstance
import kotlin.reflect.typeOf
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class QueryTest() {
    private val clientMock: DocumentServiceCoroutineStub = mockk(relaxed = true)
    private val collection = Collection(clientMock, "test-collection", User::class.java, null)

    @Test
    fun testBuild() {
        val query = collection.query()

        assertNotNull(query)
    }

    @Test
    fun testFetch() {
        val query = collection.query()

        val response = runBlocking {
            query.fetch()
        }

        coVerify(exactly = 1) {
            clientMock.query(
                DocumentQueryRequest.newBuilder()
                    .setCollection(collection.toWire())
                    .setLimit(0)
                    .build(), any()
            )
        }

        assertNotNull(response)
        assertEquals(0, response.size)
    }

    @Test
    fun testFetchWithPagingToken() {
        val query = collection.query()

        val response = runBlocking {
            query.pagingFrom(mapOf("token" to "1234")).fetch()
        }

        val request = DocumentQueryRequest.newBuilder()
            .setCollection(collection.toWire())
            .setLimit(0)

        request.putAllPagingToken(mapOf("token" to "1234"))

        coVerify(exactly = 1) {
            clientMock.query(request.build(), any())
        }

        assertNotNull(response)
        assertEquals(0, response.size)
    }

    @Test
    fun testFetchWithExpressions() {
        val query = collection.query()

        val response = runBlocking {
            query
                .where("country", Operator.EQ, "Australia")
                .where("age", Operator.GT, 12)
                .where("height", Operator.LT, 180)
                .where("name", Operator.STARTS_WITH, "J")
                .where("salary", Operator.GTE, 10000.60)
                .where("weight", Operator.LTE, 50.5)
                .where("employed", Operator.NEQ, false)
                .fetch()
        }

        coVerify(exactly = 1) {
            clientMock.query(
                DocumentQueryRequest.newBuilder()
                    .setCollection(collection.toWire())
                    .setLimit(0)
                    .addExpressions(0, Expression.newBuilder()
                        .setValue(ExpressionValue.newBuilder().setStringValue("Australia"))
                        .setOperand("country")
                        .setOperator("==")
                    )
                    .addExpressions(1, Expression.newBuilder()
                        .setValue(ExpressionValue.newBuilder().setIntValue(12))
                        .setOperand("age")
                        .setOperator(">")
                    )
                    .addExpressions(2, Expression.newBuilder()
                        .setValue(ExpressionValue.newBuilder().setIntValue(180))
                        .setOperand("height")
                        .setOperator("<")
                    )
                    .addExpressions(3, Expression.newBuilder()
                        .setValue(ExpressionValue.newBuilder().setStringValue("J"))
                        .setOperand("name")
                        .setOperator("startsWith")
                    )
                    .addExpressions(4, Expression.newBuilder()
                        .setValue(ExpressionValue.newBuilder().setDoubleValue(10000.60))
                        .setOperand("salary")
                        .setOperator(">=")
                    )
                    .addExpressions(5, Expression.newBuilder()
                        .setValue(ExpressionValue.newBuilder().setDoubleValue(50.5))
                        .setOperand("weight")
                        .setOperator("<=")
                    )
                    .addExpressions(6, Expression.newBuilder()
                        .setValue(ExpressionValue.newBuilder().setBoolValue(false))
                        .setOperand("employed")
                        .setOperator("!=")
                    )
                    .build(), any()
            )
        }

        assertNotNull(response)
        assertEquals(0, response.size)
    }

    @Test
    fun testFetchWithLimit() {
        val query = collection.query()

        val response = runBlocking {
            query.limit(100).fetch()
        }

        coVerify(exactly = 1) {
            clientMock.query(
                DocumentQueryRequest.newBuilder()
                    .setCollection(collection.toWire())
                    .setLimit(100)
                    .build(), any()
            )
        }

        assertNotNull(response)
        assertEquals(0, response.size)
    }

    @Test
    fun testFetchWithUnsignedLimit() {
        val query = collection.query()

        val response = runBlocking {
            query.limit(1u).fetch()
        }

        coVerify(exactly = 1) {
            clientMock.query(
                DocumentQueryRequest.newBuilder()
                    .setCollection(collection.toWire())
                    .setLimit(1)
                    .build(), any()
            )
        }

        assertNotNull(response)
        assertEquals(0, response.size)
    }

    @Test
    fun testFetchWithNegativeLimitDefaultsToZero() {
        val query = collection.query()

        val response = runBlocking {
            query.limit(-100).fetch()
        }

        coVerify(exactly = 1) {
            clientMock.query(
                DocumentQueryRequest.newBuilder()
                    .setCollection(collection.toWire())
                    .setLimit(0)
                    .build(), any()
            )
        }

        assertNotNull(response)
        assertEquals(0, response.size)
    }
}