package io.nitric.resources

import io.nitric.Nitric
import io.nitric.faas.v0.*
import io.nitric.faas.v0.Faas

class ScheduleResource internal constructor(private val description: String) {
    fun every(rate: Int, frequency: Frequency, vararg middleware: Handler<EventContext>) {
        val faas = Faas(ScheduleWorkerOptions(description, rate, frequency))
        middleware.forEach {
            faas.event(it)
        }
        Nitric.registerWorker(faas)
    }
}