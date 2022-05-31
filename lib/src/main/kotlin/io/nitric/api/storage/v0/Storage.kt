package io.nitric.api.storage.v0

import io.nitric.proto.storage.v1.StorageServiceGrpc
import io.nitric.proto.storage.v1.StorageServiceGrpc.StorageServiceBlockingStub;
import io.nitric.util.GrpcChannelProvider

object Storage {
  val client: StorageServiceBlockingStub = StorageServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())

  fun bucket(name: String): Bucket {
    return Bucket(this, name)
  }
}

