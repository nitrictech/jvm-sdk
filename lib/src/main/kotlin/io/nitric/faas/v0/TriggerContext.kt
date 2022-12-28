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

import io.nitric.proto.faas.v1.TriggerRequest
import io.nitric.proto.faas.v1.TriggerResponse

import kotlinx.serialization.Serializable
import java.nio.charset.Charset

/**
 * The base request structure, common to HTTP and Event requests. Contains the payload [data].
 */
abstract class AbstractRequest(val data: ByteArray) {
    /**
     * Convert the payload of the request to a string, assuming UTF-8 encoding.
     */
    fun text(): String {
        return this.data.toString(Charset.forName("utf-8"))
    }
}

/**
 * The base context structure, common to HTTP and Event contexts.
 */
abstract class TriggerContext<Req : AbstractRequest, Resp> {
    abstract val req: Req
    abstract val resp: Resp

    companion object {
        /**
         * Construct the appropriate context object based on the type of the incoming [trigger].
         */
        internal fun <T: TriggerContext<*, *>>fromGrpcTriggerRequest(trigger: TriggerRequest): T {
            if (trigger.hasHttp()) {
                return HttpContext.fromGrpcTriggerRequest(trigger) as T;
            } else if (trigger.hasTopic()) {
                return EventContext.fromGrpcTriggerRequest(trigger) as T;
            }
            throw Error("Unsupported trigger request type")
        }

        /**
         * Construct a gRPC compatible [TriggerResponse] from the [TriggerContext].
         */
        internal fun <T>toGrpcTriggerResponse(ctx: T): TriggerResponse {
            return when(ctx) {
                is HttpContext -> HttpContext.toGrpcTriggerResponse(ctx)
                is EventContext -> EventContext.toGrpcTriggerResponse(ctx)
                else -> throw Error("Unsupported trigger context types")
            }
        }
    }
}