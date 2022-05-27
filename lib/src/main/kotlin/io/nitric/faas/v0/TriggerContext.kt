package io.nitric.faas.v0

import io.nitric.proto.faas.v1.TriggerRequest
import io.nitric.proto.faas.v1.TriggerResponse

import kotlinx.serialization.Serializable
import java.nio.charset.Charset

abstract class AbstractRequest(val data: ByteArray) {
    fun text(): String {
        return this.data.toString(Charset.forName("utf-8"))
    }
}

abstract class TriggerContext<Req : AbstractRequest, Resp> {
    abstract val req: Req
    abstract val resp: Resp

    companion object {
        internal fun <T: TriggerContext<AbstractRequest, Any>>fromGrpcTriggerRequest(trigger: TriggerRequest): T {
            if (trigger.hasHttp()) {
                return HttpContext.fromGrpcTriggerRequest(trigger) as T;
            } else if (trigger.hasTopic()) {
                return EventContext.fromGrpcTriggerRequest(trigger) as T;
            }
            throw Error("Unsupported trigger request type")
        }

        internal fun <T>toGrpcTriggerResponse(ctx: T): TriggerResponse {
            return when(ctx) {
                is HttpContext -> HttpContext.toGrpcTriggerResponse(ctx)
                is EventContext -> EventContext.toGrpcTriggerResponse(ctx)
                else -> throw Error("Unsupported trigger context types")
            }
        }
    }
}