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

import io.nitric.proto.storage.v1.StorageServiceGrpcKt
import io.nitric.proto.storage.v1.StorageServiceGrpcKt.StorageServiceCoroutineStub
import io.nitric.util.GrpcChannelProvider

/**
 * Represents a storage in the storage service.
 */
internal object Storage {
  val client = StorageServiceCoroutineStub(GrpcChannelProvider.getChannel())

  /**
   * Create a reference to a bucket in the storage service by its [name].
   */
  fun bucket(name: String): Bucket {
    return Bucket(this.client, name)
  }
}

