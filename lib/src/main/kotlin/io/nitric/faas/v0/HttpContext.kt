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

package io.nitric.faas.v0

import com.google.protobuf.ByteString
import io.nitric.proto.faas.v1.HeaderValue
import io.nitric.proto.faas.v1.HttpResponseContext
import io.nitric.proto.faas.v1.TriggerRequest
import io.nitric.proto.faas.v1.TriggerResponse
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.nio.charset.Charset

/**
 * Represents a HTTP request.
 *
 * Has the following parameters:
 * - The HTTP [method] that generated this request. E.g. GET, POST, PUT, DELETE.
 * - The HTTP [path] requested.
 * - The auto-extracted path [params]. E.g. for a path "/customers/:id" [params] would contain an "id" key with the provided id value.
 * - Contains any provided [query] parameters.
 * - Contains any HTTP [headers] provided with the request.
 */
class HttpRequest internal constructor(
    data: ByteArray,
    val method: String,
    val path: String,
    val params: Map<String, String>,
    val query: Map<String, Collection<String>>,
    val headers: Map<String, Collection<String>>
) : AbstractRequest(data) {}

/**
 * The response to an HTTP trigger.
 *
 * Has the following parameters:
 * - The HTTP [status] code of the response
 * - The HTTP [body] data to be returned.
 * - The HTTP [headers] to be included in the response.
 */
class HttpResponse internal constructor(var status: Int, var body: ByteArray, var headers: MutableMap<String, Collection<String>>) {
    /**
     * Set the HTTP [body] data from an [obj].
     *
     * The [obj] must be annotated as @[kotlinx.serialization.Serializable] or a [serializer](https://kotlinlang.org/docs/serialization.html#example-json-serialization) must be provided on the class explicitly.
     *
     * The [obj] is converted to a JSON string with UTF-8 encoding and the Content-Type header is set to application/json.
     */
    inline fun <reified T> json(obj: T) {
        this.body = Json.encodeToString(obj).encodeToByteArray()
        this.headers["Content-Type"] = listOf("application/json")
    }

    /**
     * Set the HTTP body data from [text].
     *
     * The object is converted to bytes assuming UTF-8 encoding and the Content-Type header is set to text/plain.
     */
    fun text(text: String) {
        this.body = text.encodeToByteArray()
        this.headers["Content-Type"] = listOf("text/plain")
    }
}

/**
 * An HTTP context containing a [req] and [resp] object.
 */
class HttpContext internal constructor(override val req: HttpRequest, override val resp: HttpResponse) : TriggerContext<HttpRequest, HttpResponse>() {
    companion object {
        /**
         * Construct a [HttpContext] from a gRPC compatible [TriggerRequest].
         */
        internal fun fromGrpcTriggerRequest(req: TriggerRequest): HttpContext {
            val http = req.http

            val headers = HashMap<String, Collection<String>>()
            http.headersMap.entries.forEach {
                headers[it.key] = it.value.valueList
            }

            val query = HashMap<String, Collection<String>>()
            http.queryParamsMap.entries.forEach {
                query[it.key] = it.value.valueList
            }

            return HttpContext(
                HttpRequest(
                    req.data.toByteArray(),
                    http.method,
                    http.path,
                    http.pathParamsMap,
                    query,
                    headers
                ),
                // default response
                HttpResponse(
                    200,
                    "".toByteArray(Charset.forName("utf-8")),
                    mutableMapOf(Pair("Content-Type", listOf("text/plain")))
                )
            )
        }

        /**
         * Construct a gRPC [TriggerResponse] from this [HttpContext].
         */
        internal fun toGrpcTriggerResponse(ctx: HttpContext): TriggerResponse {
            val headers: HashMap<String, HeaderValue> = HashMap()
            for ((k, v) in ctx.resp.headers) {
                headers[k] = HeaderValue.newBuilder().addAllValue(v).build()
            }

            return TriggerResponse.newBuilder()
                .setData(ByteString.copyFrom(ctx.resp.body))
                .setHttp(
                    HttpResponseContext.newBuilder()
                        .putAllHeaders(headers)
                        .setStatus(ctx.resp.status)
                        .build()
                ).build()
        }
    }
}