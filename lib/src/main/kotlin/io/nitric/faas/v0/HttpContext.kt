package io.nitric.faas.v0

import com.google.protobuf.ByteString
import io.nitric.proto.faas.v1.HeaderValue
import io.nitric.proto.faas.v1.HttpResponseContext
import io.nitric.proto.faas.v1.TriggerRequest
import io.nitric.proto.faas.v1.TriggerResponse
import java.nio.charset.Charset

class HttpRequest(
    data: ByteArray,
    val method: String,
    val path: String,
    val params: Map<String, String>,
    val query: Map<String, Collection<String>>,
    val headers: Map<String, Collection<String>>
) : AbstractRequest(data) {

}

class HttpResponse(var status: Int, var body: ByteArray, var headers: Map<String, Collection<String>>) {
    fun json() {
        // TODO: Implement...
    }
}

class HttpContext(override val req: HttpRequest, override val resp: HttpResponse) : TriggerContext<HttpRequest, HttpResponse>() {
    companion object {
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