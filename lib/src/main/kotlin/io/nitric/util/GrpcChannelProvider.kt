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

        this.chan = ManagedChannelBuilder.forAddress(Environment.getNitricServiceHost(), Environment.getNitricPort().toInt()).usePlaintext().build()

        return this.chan!!
    }
}
