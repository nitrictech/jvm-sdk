// Copyright 2021, Nitric Technologies Pty Ltd.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package io.nitric.api.documents.v0

import io.nitric.proto.document.v1.DocumentQueryRequest
import io.nitric.proto.document.v1.DocumentServiceGrpc.DocumentServiceBlockingStub
import io.nitric.proto.document.v1.Expression
import io.nitric.proto.document.v1.ExpressionValue
import io.nitric.util.ProtoUtils
import io.nitric.util.fluently

/**
 * Document level operations
 */
enum class Operator(val value: String) {
    LT("<"),
    LTE("<="),
    EQ("=="),
    NEQ("!="),
    GTE(">="),
    GT(">"),
    STARTS_WITH("startsWith"),
}

/**
 * A [Query] object used to construct [DocumentReference] queries. The expected [type] of the document is provided.
 */
class Query<T> internal constructor(private val client: DocumentServiceBlockingStub, private val collection: Collection<T>, private val type: Class<T>) {
    private var expressions: ArrayList<Expression> = ArrayList()
    private var pagingToken: Map<String, String>? = null
    private var fetchLimit: UInt = UInt.MIN_VALUE

    /**
     * Add a 'where' clause to this query.
     * E.g. Find all documents where city ([field]) startsWith ([operator]) 'New' ([value]).
     */
    fun where(field: String, operator: Operator, value: String) = fluently {
        this.expressions.add(whereObj(field, operator, value))
    }

    /**
     * Add a 'where' clause to this query.
     * E.g. Find all documents where active ([field]) == ([operator]) true ([value]).
     */
    fun where(field: String, operator: Operator, value: Boolean) = fluently {
        this.expressions.add(whereObj(field, operator, value))
    }

    /**
     * Add a 'where' clause to this query.
     * E.g. Find all documents where age ([field]) >= ([operator]) 20 ([value]).
     */
    fun where(field: String, operator: Operator, value: Number) = fluently {
        this.expressions.add(whereObj(field, operator, value))
    }

    /**
     * Query results starting from an existing paging token.
     *
     * Used when paging the results of a [Query] for requesting subsequent pages.
     */
    fun pagingFrom(token: Map<String, String>) = fluently {
        this.pagingToken = token
    }

    /**
     * Limit the number of results returned by this [Query]. The [limit] must be a positive integer.
     */
    fun limit(limit: UInt) = fluently {
        this.fetchLimit = limit
    }

    /**
     * Limit the number of results returned by this [Query]. The [limit] must be a positive integer.
     */
    fun limit(limit: Int) = fluently {
        if (limit < 0) this.fetchLimit = UInt.MIN_VALUE else this.fetchLimit = limit.toUInt()
    }

    /**
     * Retrieve all found results as a list of [DocumentSnapshot]s.
     */
    fun fetch(): List<DocumentSnapshot<T>> {
        val request = DocumentQueryRequest
            .newBuilder()
            .setCollection(this.collection.toWire())
            .setLimit(this.fetchLimit.toInt())

        if (this.pagingToken != null) {
            request.putAllPagingToken(this.pagingToken)
        }

        for ((idx, value) in expressions.withIndex()) {
            request.addExpressions(idx, value)
        }

        val response = this.client.query(request.build())
        val gson = DocumentSerializer.gsonBuilder.create()

        return response.documentsList.map {
            DocumentSnapshot(
                DocumentReference<T>(this.client, this.collection, this.type, it.key.id),
                gson.fromJson(gson.toJsonTree(ProtoUtils.toMap(it.content)), this.type)
            )
        }
    }

    // TODO: Implement document streaming
    //  fun stream()

    /**
     * Convert the where calls into [Expression]s.
     */
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

