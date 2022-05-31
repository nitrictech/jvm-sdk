package io.nitric.resources

import io.nitric.Nitric
import io.nitric.faas.v0.*
import io.nitric.faas.v0.Faas

class ApiResource(val name: String) {
    fun get(path: String, middleware: Handler<HttpContext>) = method(path, middleware, HttpMethod.GET)
    fun post(path: String, middleware: Handler<HttpContext>) = method(path, middleware, HttpMethod.POST)
    fun delete(path: String, middleware: Handler<HttpContext>) = method(path, middleware, HttpMethod.DELETE)
    fun put(path: String, middleware: Handler<HttpContext>) = method(path, middleware, HttpMethod.PUT)
    fun patch(path: String, middleware: Handler<HttpContext>) = method(path, middleware, HttpMethod.PATCH)
    fun options(path: String, middleware: Handler<HttpContext>) = method(path, middleware, HttpMethod.OPTIONS)
    fun route(path: String, middleware: Handler<HttpContext>, vararg methods: HttpMethod) = method(path, middleware, *methods)
    fun all(path: String, middleware: Handler<HttpContext>) = method(path, middleware, *HttpMethod.values())
}

internal fun ApiResource.method(path: String, middleware: Handler<HttpContext>, vararg methods: HttpMethod) {
    val faas = Faas(ApiWorkerOptions(this.name, path, methods.toSet()))
    faas.http(middleware)
    Nitric.registerWorker(faas)
}