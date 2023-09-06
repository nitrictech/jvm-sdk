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

import io.nitric.proto.faas.v1.BucketNotificationWorker
import io.nitric.proto.faas.v1.NotificationResponseContext
import io.nitric.proto.faas.v1.TriggerRequest
import io.nitric.proto.faas.v1.TriggerResponse

enum class BucketNotificationType {
    Write,
    Delete
}

/**
 * Represents the [req]/[resp] context for an event.
 */
data class BucketNotificationContext internal constructor(
    override val req: BucketNotificationRequest,
    override val resp: BucketNotificationResponse
) : TriggerContext<BucketNotificationRequest, BucketNotificationResponse>() {
    companion object {
        /**
         * Construct an event topic from a trigger [request] gRPC object.
         */
        internal fun fromGrpcTriggerRequest(request: TriggerRequest, opts: BucketNotificationWorkerOptions): BucketNotificationContext {
            val event = request.notification.bucket

            // Converts the proto bucket notification type to SDK notification type
            if (event.type.ordinal > 1) {
                throw IllegalArgumentException("unsupported bucket notification type: ${event.type.name}")
            }
            val eventType = BucketNotificationType.values()[event.type.ordinal]

            return BucketNotificationContext(
                BucketNotificationRequest(request.data.toByteArray(), opts.bucket, event.key, eventType),
                BucketNotificationResponse(true)
            )
        }

        /**
         * Construct a gRPC trigger response from this [ctx].
         */
        internal fun toGrpcTriggerResponse(ctx: BucketNotificationContext): TriggerResponse {
            return TriggerResponse.newBuilder()
                .setNotification(
                    NotificationResponseContext.newBuilder()
                        .setSuccess(ctx.resp.success)
                        .build()
                )
                .build()
        }
    }
}

/**
 * Represents a message pushed to a bucket notification subscription via a [bucket].
 */
class BucketNotificationRequest internal constructor(
    data: ByteArray,
    val bucket: String,
    val key: String,
    val notificationType: BucketNotificationType
) : AbstractRequest(data)

/**
 * Represents the results of processing an event. Can view if the event was a [success] or not.
 */
data class BucketNotificationResponse internal constructor(val success: Boolean = true)