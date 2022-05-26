package io.nitric.util

import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder

/**
 *
 */
object GrpcChannelProvider {
    private var chan: ManagedChannel? = null

     @Synchronized fun getChannel(): ManagedChannel {
        if (this.chan != null && !this.chan?.isShutdown!! && !this.chan?.isTerminated!!) {
            return this.chan!!
        }

        this.chan = ManagedChannelBuilder.forTarget("${Environment.getNitricServiceHost()}:${Environment.getNitricPort()}").build()

        return this.chan!!
    }
}
