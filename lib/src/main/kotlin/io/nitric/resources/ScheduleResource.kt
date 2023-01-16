package io.nitric.resources

import io.nitric.Nitric
import io.nitric.faas.v0.*
import io.nitric.faas.v0.Faas

class ScheduleResource internal constructor(private val description: String) {
    fun every(rate: Int, frequency: Frequency, vararg middleware: Middleware<EventContext>) {
        val faas = Faas(ScheduleWorkerOptions(description, rate, frequency))
        middleware.forEach { faas.event(it) }
        Nitric.registerWorker(faas)
    }

    fun every(rate: Int, frequency: Frequency, middleware: Handler<EventContext>) {
        val faas = Faas(ScheduleWorkerOptions(description, rate, frequency))
        faas.event { ctx, next ->
            val context = middleware(ctx)
            next(context)
        }
        Nitric.registerWorker(faas)
    }
}