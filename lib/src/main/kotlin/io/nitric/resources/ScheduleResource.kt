package io.nitric.resources

import io.nitric.Nitric
import io.nitric.faas.v0.*
import io.nitric.faas.v0.Faas
import io.nitric.proto.faas.v1.ScheduleCron

class ScheduleResource internal constructor(private val description: String) {
    /**
     * Register middleware to be run every [rate] [frequency].
     * e.g. Generate a report every 7 days
     */
    fun every(rate: Int, frequency: Frequency, middleware: List<Middleware<EventContext>>) {
        val faas = Faas(ScheduleWorkerRateOptions(description, rate, frequency))
        middleware.forEach { faas.event(it) }
        Nitric.registerWorker(faas)
    }
    /**
     * Register middleware to be run every [rate] [frequency].
     * e.g. Generate a report every 7 days
     */
    fun every(rate: Int, frequency: Frequency, middleware: Handler<EventContext>) {
        val faas = Faas(ScheduleWorkerRateOptions(description, rate, frequency))
        faas.event { ctx, next ->
            val context = middleware(ctx)
            next(context)
        }
        Nitric.registerWorker(faas)
    }
    /**
     * Register middleware to be run via a [cron] expression
     * e.g. Generate a report every 7 days (0 0 * * 7)
     */
    fun cron(cron: String, middleware: List<Middleware<EventContext>>) {
        val faas = Faas(ScheduleWorkerCronOptions(description, cron))
        middleware.forEach { faas.event(it) }
        Nitric.registerWorker(faas)
    }
    /**
     * Register middleware to be run via a [cron] expression.
     * e.g. Generate a report every 7 days (0 0 * * 7)
     */
    fun cron(cron: String, middleware: Handler<EventContext>) {
        val faas = Faas(ScheduleWorkerCronOptions(description, cron))
        faas.event { ctx, next ->
            val context = middleware(ctx)
            next(context)
        }
        Nitric.registerWorker(faas)
    }
}