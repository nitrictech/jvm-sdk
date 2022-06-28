package io.nitric.api.documents.v0

import io.nitric.proto.document.v1.DocumentQueryRequest
import io.nitric.proto.document.v1.DocumentServiceGrpc.DocumentServiceBlockingStub
import io.nitric.proto.document.v1.Expression
import io.nitric.proto.document.v1.ExpressionValue
import io.nitric.util.ProtoUtils
import io.nitric.util.fluently

enum class Operator(val value: String) {
    LT("<"),
    LTE("<="),
    EQ("=="),
    NEQ("!="),
    GTE(">="),
    GT(">"),
    STARTS_WITH("startsWith"),
}

class Query<T> internal constructor(private val client: DocumentServiceBlockingStub, private val collection: Collection<T>, private val type: Class<T>) {

    private var expressions: ArrayList<Expression> = ArrayList()
    private var pagingToken: Map<String, String>? = null
    private var fetchLimit: Int = 0

    fun where(field: String, operator: Operator, value: String) = fluently {
        this.expressions.add(whereObj(field, operator, value))
    }

    fun where(field: String, operator: Operator, value: Boolean) = fluently {
        this.expressions.add(whereObj(field, operator, value))
    }

    fun where(field: String, operator: Operator, value: Number) = fluently {
        this.expressions.add(whereObj(field, operator, value))
    }

    fun pagingFrom(token: Map<String, String>) = fluently {
        this.pagingToken = token
    }

    fun limit(limit: Int) = fluently {
        this.fetchLimit = limit
    }

    fun fetch(): List<DocumentSnapshot<T>> {
        val request = DocumentQueryRequest
            .newBuilder()
            .setCollection(this.collection.toWire())
            .setLimit(this.fetchLimit)

        if (this.pagingToken != null) {
            request.putAllPagingToken(this.pagingToken)
        }

        for ((idx, value) in expressions.withIndex()) {
            request.setExpressions(idx, value)
        }

        val response = this.client.query(request.build())
        val gson = DocumentSerializer.gsonBuilder.create()

        return response.documentsList.map {
            DocumentSnapshot(
                DocumentReference(this.client, this.collection, this.type, it.key.id),
                gson.fromJson(gson.toJsonTree(ProtoUtils.toMap(it.content)), this.type)
            )
        }
    }

    // TODO: Implement document streaming
    //    fun stream() {
    //
    //        throw
    //    }

    private fun whereObj(field: String, operator: Operator, value: Any): Expression {
        val expressionValue: ExpressionValue = when(value) {
            is Double -> ExpressionValue.newBuilder().setDoubleValue(value).build()
            is Number -> ExpressionValue.newBuilder().setIntValue(value.toLong()).build()
            is String -> ExpressionValue.newBuilder().setStringValue(value).build()
            is Boolean -> ExpressionValue.newBuilder().setBoolValue(value).build()
            else -> throw IllegalArgumentException("Invalid expression value supplied")
        }

        return Expression.newBuilder()
            .setValue(expressionValue)
            .setOperand(field)
            .setOperator(operator.value)
            .build()
    }
}

