package io.nitric.resources

import com.google.api.Http
import io.nitric.Nitric
import io.nitric.faas.v0.*
import io.nitric.faas.v0.Faas

open class SecurityDefinition(private val kind: String)

data class JwtSecurityDefinition(val issuer: String, val audiences: List<String>) : SecurityDefinition("jwt")

data class ApiOptions(
    val securityDefinitions: Map<String, SecurityDefinition> = mapOf(),
    val security: Map<String, List<String>> = mapOf(),
    val basePath: String = "",
    val middleware: List<Middleware<HttpContext>> = listOf()
)

class Route internal constructor(private val api: ApiResource, val path: String) {
    /**
     * Register a handler on a route for GET HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun get(path: String, middleware: Handler<HttpContext>) = api.method(path, listOf(HttpMethod.GET), middleware)
    /**
     * Register a handler on a route for GET HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun get(path: String, middleware: List<Middleware<HttpContext>>) = api.method(path, listOf(HttpMethod.GET), middleware)
    /**
     * Register a handler on a route for POST HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun post(path: String, middleware: Handler<HttpContext>) = api.method(path, listOf(HttpMethod.POST), middleware)
    /**
     * Register a handler on a route for POST HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun post(path: String, middleware: List<Middleware<HttpContext>>) = api.method(path, listOf(HttpMethod.POST), middleware)
    /**
     * Register a handler on a route for DELETE HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun delete(path: String, middleware: Handler<HttpContext>) = api.method(path, listOf(HttpMethod.DELETE), middleware)
    /**
     * Register a handler on a route for DELETE HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun delete(path: String, middleware: List<Middleware<HttpContext>>) = api.method(path, listOf(HttpMethod.DELETE), middleware)
    /**
     * Register a handler on a route for PUT HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun put(path: String, middleware: Handler<HttpContext>) = api.method(path, listOf(HttpMethod.PUT), middleware)
    /**
     * Register a handler on a route for PUT HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun put(path: String, middleware: List<Middleware<HttpContext>>) = api.method(path, listOf(HttpMethod.PUT), middleware)
    /**
     * Register a handler on a route for PATCH HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun patch(path: String, middleware: Handler<HttpContext>) = api.method(path, listOf(HttpMethod.PATCH), middleware)
    /**
     * Register a handler on a route for PATCH HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun patch(path: String, middleware: List<Middleware<HttpContext>>) = api.method(path, listOf(HttpMethod.PATCH), middleware)
    /**
     * Register a handler on a route for OPTIONS HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun options(path: String, middleware: Handler<HttpContext>) = api.method(path, listOf(HttpMethod.OPTIONS), middleware)
    /**
     * Register a handler on a route for OPTIONS HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun options(path: String, middleware: List<Middleware<HttpContext>>) = api.method(path, listOf(HttpMethod.OPTIONS), middleware)
    /**
     * Register a handler on a route for all HTTP methods
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun all(path: String, middleware: Handler<HttpContext>) = api.method(path, HttpMethod.values().toList(), middleware)
    /**
     * Register a handler on a route for all HTTP methods with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun all(path: String, middleware: List<Middleware<HttpContext>>) = api.method(path, HttpMethod.values().toList(), middleware)
}
/**
 *
 */
class ApiResource internal constructor(val name: String, val options: ApiOptions = ApiOptions()) {
    /**
     * Register a handler on a route for GET HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun get(path: String, middleware: Handler<HttpContext>) = method(path, listOf(HttpMethod.GET), middleware)
    /**
     * Register a handler on a route for GET HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun get(path: String, middleware: List<Middleware<HttpContext>>) = method(path, listOf(HttpMethod.GET), middleware)
    /**
     * Register a handler on a route for POST HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun post(path: String, middleware: Handler<HttpContext>) = method(path, listOf(HttpMethod.POST), middleware)
    /**
     * Register a handler on a route for POST HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun post(path: String, middleware: List<Middleware<HttpContext>>) = method(path, listOf(HttpMethod.POST), middleware)
    /**
     * Register a handler on a route for DELETE HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun delete(path: String, middleware: Handler<HttpContext>) = method(path, listOf(HttpMethod.DELETE), middleware)
    /**
     * Register a handler on a route for DELETE HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun delete(path: String, middleware: List<Middleware<HttpContext>>) = method(path, listOf(HttpMethod.DELETE), middleware)
    /**
     * Register a handler on a route for PUT HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun put(path: String, middleware: Handler<HttpContext>) = method(path, listOf(HttpMethod.PUT), middleware)
    /**
     * Register a handler on a route for PUT HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun put(path: String, middleware: List<Middleware<HttpContext>>) = method(path, listOf(HttpMethod.PUT), middleware)
    /**
     * Register a handler on a route for PATCH HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun patch(path: String, middleware: Handler<HttpContext>) = method(path, listOf(HttpMethod.PATCH), middleware)
    /**
     * Register a handler on a route for PATCH HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun patch(path: String, middleware: List<Middleware<HttpContext>>) = method(path, listOf(HttpMethod.PATCH), middleware)
    /**
     * Register a handler on a route for OPTIONS HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun options(path: String, middleware: Handler<HttpContext>) = method(path, listOf(HttpMethod.OPTIONS), middleware)
    /**
     * Register a handler on a route for OPTIONS HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun options(path: String, middleware: List<Middleware<HttpContext>>) = method(path, listOf(HttpMethod.OPTIONS), middleware)
    /**
     * Register a handler on a route for all HTTP methods
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     */
    fun all(path: String, middleware: Handler<HttpContext>) = method(path, HttpMethod.values().toList(), middleware)
    /**
     * Register a handler on a route for all HTTP methods with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun all(path: String, middleware: List<Middleware<HttpContext>>) = method(path, HttpMethod.values().toList(), middleware)

    /**
     * Register a new route
     *
     * @param path A path pattern to match on
     */
    fun route(path: String) = Route(this, path)
}

internal fun ApiResource.method(path: String, methods: List<HttpMethod>, middleware: Handler<HttpContext>) {
    val faas = Faas(ApiWorkerOptions(this.name, path, methods.toSet(), MethodOptions(this.options.security, this.options.securityDefinitions)))
    faas.http { ctx, next ->
        val context = middleware(ctx)
        next(context)
    }
    Nitric.registerWorker(faas)
}

internal fun ApiResource.method(path: String, methods: List<HttpMethod>, middleware: List<Middleware<HttpContext>>) {
    val faas = Faas(ApiWorkerOptions(this.name, path, methods.toSet(), MethodOptions(this.options.security, this.options.securityDefinitions)))
    middleware.forEach { faas.http(it) }
    Nitric.registerWorker(faas)
}