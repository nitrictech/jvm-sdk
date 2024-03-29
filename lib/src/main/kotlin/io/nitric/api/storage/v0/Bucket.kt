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

package io.nitric.api.storage.v0

import io.nitric.Nitric
import io.nitric.faas.v0.*
import io.nitric.faas.v0.BucketNotificationWorkerOptions
import io.nitric.faas.v0.Faas
import io.nitric.proto.storage.v1.StorageListFilesRequest
import io.nitric.proto.storage.v1.StorageServiceGrpc.StorageServiceBlockingStub

/**
 * A reference to a bucket in the storage service by its [name].
 */
class Bucket internal constructor(internal val client: StorageServiceBlockingStub, val name: String) {
    /**
     * List all the [File]s in the [Bucket].
     */
    fun files(): List<File> {
          val resp = this.client.listFiles(
            StorageListFilesRequest.newBuilder()
                .setBucketName(this.name)
                .build()
          )

        return resp.filesList.map{ f -> File(this, f.key)  }
    }

    /**
     * Create a reference to a [File] in the [Bucket]. Referenced by the file [name].
     */
    fun file(name: String): File {
        return File(this, name)
    }

    /**
     * Create a bucket notification subscription that is triggered on a [notificationType] and filtered by a [notificationPrefixFilter].
     */
    fun on(notificationType: BucketNotificationType, notificationPrefixFilter: String, middleware: Handler<FileNotificationContext>) {
        val faas = Faas(FileNotificationWorkerOptions(this, notificationType, notificationPrefixFilter))
        faas.fileNotification { ctx, _ -> middleware(ctx) }
        Nitric.registerWorker(faas)
    }

    /**
     * Create a bucket notification subscription that is triggered on a [notificationType] and filtered by a [notificationPrefixFilter].
     */
    fun on(notificationType: BucketNotificationType, notificationPrefixFilter: String, middleware: List<Middleware<FileNotificationContext>>) {
        val faas = Faas(FileNotificationWorkerOptions(this, notificationType, notificationPrefixFilter))
        middleware.forEach { faas.fileNotification(it) }
        Nitric.registerWorker(faas)
    }
}