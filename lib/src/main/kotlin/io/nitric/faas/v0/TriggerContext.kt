package io.nitric.faas.v0

import io.nitric.proto.faas.v1.TriggerRequest
import io.nitric.proto.faas.v1.TriggerResponse

import kotlinx.serialization.Serializable

abstract class AbstractRequest(val data: ByteArray) {
    fun text(): String {
        return this.data.toString()
    }

    fun json(): Map<String, Any> {

    }

}

abstract class TriggerContext<Req : AbstractRequest, Resp : Map<String, Any>> {
    abstract val req: Req
    abstract val resp: Resp
    val http: HttpContext? = null
    val event: EventContext? = null

    companion object {
        @JvmStatic
        fun fromGrpcTriggerRequest(trigger: TriggerRequest): TriggerContext<AbstractRequest, Map<String, Any>> {
            if (trigger.hasHttp()) {
                return HttpContext.fromGrpcTriggerRequest(trigger);
            } else if (trigger.hasTopic()) {
                return EventContext.fromGrpcTriggerRequest(trigger);
            }
            throw Error("Unsupported trigger request type")
        }

        @JvmStatic
        fun toGrpcTriggerResponse(ctx: TriggerContext<AbstractRequest, Map<String, Any>>): TriggerResponse {
            ctx.http ?: return HttpContext.toGrpcTriggerResponse(ctx)
            ctx.event ?: return EventContext.toGrpcTriggerResponse(ctx)
            throw Error("Unsupported trigger context types")
        }
    }
}