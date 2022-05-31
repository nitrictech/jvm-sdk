package io.nitric.resources

import io.nitric.Nitric
import io.nitric.faas.v0.*
import io.nitric.faas.v0.Faas

class ScheduleResource(private val description: String) {
    fun every(rate: Int, frequency: Frequency, middleware: Middleware<EventContext>) {
        val faas = Faas(ScheduleWorkerOptions(description, rate, frequency))
        faas.event(middleware)
        Nitric.registerWorker(faas)
    }
}