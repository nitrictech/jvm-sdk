package io.nitric.resources

import io.nitric.Nitric
import io.nitric.faas.v0.*
import io.nitric.faas.v0.Faas

class Route internal constructor(private val api: ApiResource, val path: String) {
    fun get(vararg middleware: Handler<HttpContext>) = api.method(this.path, listOf(HttpMethod.GET), *middleware)
    fun post(vararg middleware: Handler<HttpContext>) = api.method(this.path, listOf(HttpMethod.POST), *middleware)
    fun delete(vararg middleware: Handler<HttpContext>) = api.method(this.path, listOf(HttpMethod.DELETE), *middleware)
    fun put(vararg middleware: Handler<HttpContext>) = api.method(this.path, listOf(HttpMethod.PUT), *middleware)
    fun patch(vararg middleware: Handler<HttpContext>) = api.method(this.path, listOf(HttpMethod.PATCH), *middleware)
    fun options(vararg middleware: Handler<HttpContext>) = api.method(this.path, listOf(HttpMethod.OPTIONS), *middleware)
    fun all(vararg middleware: Handler<HttpContext>) = api.method(this.path, HttpMethod.values().toList(), *middleware)
}
/**
 *
 */
class ApiResource internal constructor(val name: String) {
    fun get(path: String, vararg middleware: Handler<HttpContext>) = method(path, listOf(HttpMethod.GET), *middleware)
    fun post(path: String, vararg middleware: Handler<HttpContext>) = method(path, listOf(HttpMethod.POST), *middleware)
    fun delete(path: String, vararg middleware: Handler<HttpContext>) = method(path, listOf(HttpMethod.DELETE), *middleware)
    fun put(path: String, vararg middleware: Handler<HttpContext>) = method(path, listOf(HttpMethod.PUT), *middleware)
    fun patch(path: String, vararg middleware: Handler<HttpContext>) = method(path, listOf(HttpMethod.PATCH), *middleware)
    fun options(path: String, vararg middleware: Handler<HttpContext>) = method(path, listOf(HttpMethod.OPTIONS), *middleware)

    fun route(path: String) = Route(this, path)

    /**
     * Register a handler on a route for all HTTP methods
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun all(path: String, vararg middleware: Handler<HttpContext>) = method(path, HttpMethod.values().toList(), *middleware)
}

internal fun ApiResource.method(path: String, methods: List<HttpMethod>, vararg middleware: Handler<HttpContext>) {
    val faas = Faas(ApiWorkerOptions(this.name, path, methods.toSet()))
    middleware.forEach { faas.http(it) }
    Nitric.registerWorker(faas)
}