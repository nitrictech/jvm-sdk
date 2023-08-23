package io.nitric.faas.v0

import io.nitric.api.storage.v0.Bucket
import io.nitric.proto.faas.v1.NotificationResponseContext
import io.nitric.proto.faas.v1.TriggerRequest
import io.nitric.proto.faas.v1.TriggerResponse

data class FileNotificationContext internal constructor(
    override val req: FileNotificationRequest,
    override val resp: BucketNotificationResponse
) : TriggerContext<FileNotificationRequest, BucketNotificationResponse>() {
    companion object {
        /**
         * Construct an event topic from a trigger [request] gRPC object.
         */
        internal fun fromGrpcTriggerRequest(request: TriggerRequest, opts: FileNotificationWorkerOptions): FileNotificationContext {
            val event = request.notification.bucket

            // Converts the proto bucket notification type to SDK notification type
            if (event.type.ordinal > 1) {
                throw IllegalArgumentException("unsupported bucket notification type: ${event.type.name}")
            }
            val eventType = BucketNotificationType.values()[event.type.ordinal]

            return FileNotificationContext(
                FileNotificationRequest(request.data.toByteArray(), opts.bucket, event.key, eventType),
                BucketNotificationResponse(true)
            )
        }

        /**
         * Construct a gRPC trigger response from this [ctx].
         */
        internal fun toGrpcTriggerResponse(ctx: FileNotificationContext): TriggerResponse {
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
 * Represents a message pushed to a file notification subscription via a [bucket].
 */
class FileNotificationRequest internal constructor(
    data: ByteArray,
    val bucket: Bucket,
    val key: String,
    val notificationType: BucketNotificationType
) : AbstractRequest(data) {
    val file = bucket.file(key)
}