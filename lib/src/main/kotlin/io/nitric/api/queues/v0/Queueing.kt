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

package io.nitric.api.queues.v0

import io.nitric.proto.queue.v1.QueueServiceGrpc.QueueServiceBlockingStub
import io.nitric.proto.queue.v1.QueueServiceGrpc
import io.nitric.util.GrpcChannelProvider

/**
 * A queues service client.
 */
internal object Queueing {
    val client: QueueServiceBlockingStub = QueueServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())

    /**
     * Create a reference to a [Queue] in the queues service by its [name].
     */
    fun queue(name: String): Queue {
        return Queue(this.client, name)
    }
}

