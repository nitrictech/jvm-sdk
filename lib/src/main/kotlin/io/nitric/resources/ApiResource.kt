package io.nitric.resources

import com.google.api.Http
import io.nitric.Nitric
import io.nitric.faas.v0.*
import io.nitric.faas.v0.Faas
import io.nitric.proto.resource.v1.Resource
import io.nitric.proto.resource.v1.ResourceDetailsRequest
import io.nitric.proto.resource.v1.ResourceServiceGrpc
import io.nitric.proto.resource.v1.ResourceType
import io.nitric.util.GrpcChannelProvider

abstract class SecurityDefinition(private val kind: String)

data class JwtSecurityDefinition(val issuer: String, val audiences: List<String>) : SecurityDefinition("jwt")

class ApiOptions(
    val basePath: String = "",
    val middleware: List<Middleware<HttpContext>> = listOf(),
    val securityDefinitions: Map<String, SecurityDefinition> = mapOf(),
    val security: Map<String, List<String>> = mapOf(),
) {
    private constructor(builder: Builder) : this(
        basePath = builder.basePath,
        middleware = builder.middleware,
        securityDefinitions = builder.securityDefinitions,
        security = builder.security,
    )

    // Using a builder for Java conversion
    class Builder {
        var securityDefinitions: Map<String, SecurityDefinition> = mapOf()
            private set

        var security: Map<String, List<String>> = mapOf()
            private set

        var basePath: String = ""
            private set

        var middleware: List<Middleware<HttpContext>> = listOf()
            private set

        fun securityDefinitions(securityDefinitions: Map<String, SecurityDefinition>) =
            apply { this.securityDefinitions = securityDefinitions }

        fun security(security: Map<String, List<String>>) = apply { this.security = security }

        fun basePath(basePath: String) = apply { this.basePath = basePath }

        fun middleware(vararg middleware: Middleware<HttpContext>) = apply { this.middleware = middleware.toList() }

        fun build() = ApiOptions(this)
    }
}

class RouteOptions(
    val middleware: List<Middleware<HttpContext>> = listOf(),
    val security: Map<String, List<String>> = mapOf(),
) {
    private constructor(builder: Builder) : this(
        middleware = builder.middleware,
        security = builder.security,
    )

    // Using a builder for Java conversion
    class Builder {
        var security: Map<String, List<String>> = mapOf()
            private set

        var middleware: List<Middleware<HttpContext>> = listOf()
            private set

        fun security(security: Map<String, List<String>>) = apply { this.security = security }

        fun middleware(middleware: List<Middleware<HttpContext>>) = apply { this.middleware = middleware }

        fun middleware(middleware: Middleware<HttpContext>) = apply { this.middleware = listOf(middleware) }

        fun build() = RouteOptions(this)
    }
}

class Route internal constructor(
    private val api: ApiResource,
    val path: String,
    val options: RouteOptions,
) {

    /**
     * Register a handler on a route for GET HTTP requests
     *
     * @param middleware A [Handler] of [HttpContext]
     */
    fun get(middleware: Handler<HttpContext>) = api.method(path, listOf(HttpMethod.GET), middleware, this.options)

    /**
     * Register a handler on a route for GET HTTP requests with middleware
     *
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun get(middleware: List<Middleware<HttpContext>>) =
        api.method(path, listOf(HttpMethod.GET), middleware, this.options)

    /**
     * Register a handler on a route for POST HTTP requests
     *
     * @param middleware A [Handler] of [HttpContext]
     */
    fun post(middleware: Handler<HttpContext>) = api.method(path, listOf(HttpMethod.POST), middleware, this.options)

    /**
     * Register a handler on a route for POST HTTP requests with middleware
     *
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun post(middleware: List<Middleware<HttpContext>>) =
        api.method(path, listOf(HttpMethod.POST), middleware, this.options)

    /**
     * Register a handler on a route for DELETE HTTP requests
     *
     * @param middleware A [Handler] of [HttpContext]
     */
    fun delete(middleware: Handler<HttpContext>) = api.method(path, listOf(HttpMethod.DELETE), middleware, this.options)

    /**
     * Register a handler on a route for DELETE HTTP requests with middleware
     *
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun delete(middleware: List<Middleware<HttpContext>>) =
        api.method(path, listOf(HttpMethod.DELETE), middleware, this.options)

    /**
     * Register a handler on a route for PUT HTTP requests
     *
     * @param middleware A [Handler] of [HttpContext]
     */
    fun put(middleware: Handler<HttpContext>) = api.method(path, listOf(HttpMethod.PUT), middleware, this.options)

    /**
     * Register a handler on a route for PUT HTTP requests with middleware
     *
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun put(middleware: List<Middleware<HttpContext>>) =
        api.method(path, listOf(HttpMethod.PUT), middleware, this.options)

    /**
     * Register a handler on a route for PATCH HTTP requests
     *
     * @param middleware A [Handler] of [HttpContext]
     */
    fun patch(middleware: Handler<HttpContext>) = api.method(path, listOf(HttpMethod.PATCH), middleware, this.options)

    /**
     * Register a handler on a route for PATCH HTTP requests with middleware
     *
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun patch(middleware: List<Middleware<HttpContext>>) =
        api.method(path, listOf(HttpMethod.PATCH), middleware, this.options)

    /**
     * Register a handler on a route for OPTIONS HTTP requests
     *
     * @param middleware A [Handler] of [HttpContext]
     */
    fun options(middleware: Handler<HttpContext>) =
        api.method(path, listOf(HttpMethod.OPTIONS), middleware, this.options)

    /**
     * Register a handler on a route for OPTIONS HTTP requests with middleware
     *
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun options(middleware: List<Middleware<HttpContext>>) =
        api.method(path, listOf(HttpMethod.OPTIONS), middleware, this.options)

    /**
     * Register a handler on a route for all HTTP methods
     *
     * @param middleware A [Handler] of [HttpContext]
     */
    fun all(middleware: Handler<HttpContext>) = api.method(path, HttpMethod.values().toList(), middleware, this.options)

    /**
     * Register a handler on a route for all HTTP methods with middleware
     *
     * @param middleware A list of [Handler]s of [HttpContext]
     */
    fun all(middleware: List<Middleware<HttpContext>>) =
        api.method(path, HttpMethod.values().toList(), middleware, this.options)
}

class ApiDetails(id: String, provider: String, service: String, val url: String) :
    ResourceDetails(id, provider, service)

class ApiResource internal constructor(val name: String, val options: ApiOptions = ApiOptions()) {
    private val client = ResourceServiceGrpc.newBlockingStub(GrpcChannelProvider.getChannel())

    fun details(): ApiDetails {
        val detailsResponse = this.client.details(
            ResourceDetailsRequest.newBuilder().setResource(
                Resource.newBuilder().setName(this.name).setType(ResourceType.Api).build()
            ).build()
        )

        return ApiDetails(
            detailsResponse.id,
            detailsResponse.provider,
            detailsResponse.service,
            detailsResponse.api.url
        )
    }

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
     * Register a handler on a route for GET HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun get(path: String, middleware: Handler<HttpContext>, options: RouteOptions) =
        method(path, listOf(HttpMethod.GET), middleware, options)

    /**
     * Register a handler on a route for GET HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun get(path: String, middleware: List<Middleware<HttpContext>>, options: RouteOptions) =
        method(path, listOf(HttpMethod.GET), middleware, options)

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
    fun post(path: String, middleware: List<Middleware<HttpContext>>) =
        method(path, listOf(HttpMethod.POST), middleware)

    /**
     * Register a handler on a route for POST HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun post(path: String, middleware: Handler<HttpContext>, options: RouteOptions) =
        method(path, listOf(HttpMethod.POST), middleware, options)

    /**
     * Register a handler on a route for POST HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun post(path: String, middleware: List<Middleware<HttpContext>>, options: RouteOptions) =
        method(path, listOf(HttpMethod.POST), middleware, options)

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
    fun delete(path: String, middleware: List<Middleware<HttpContext>>) =
        method(path, listOf(HttpMethod.DELETE), middleware)

    /**
     * Register a handler on a route for DELETE HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun delete(path: String, middleware: Handler<HttpContext>, options: RouteOptions) =
        method(path, listOf(HttpMethod.DELETE), middleware, options)

    /**
     * Register a handler on a route for DELETE HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun delete(path: String, middleware: List<Middleware<HttpContext>>, options: RouteOptions) =
        method(path, listOf(HttpMethod.DELETE), middleware, options)

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
     * Register a handler on a route for PUT HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun put(path: String, middleware: Handler<HttpContext>, options: RouteOptions) =
        method(path, listOf(HttpMethod.PUT), middleware, options)

    /**
     * Register a handler on a route for PUT HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun put(path: String, middleware: List<Middleware<HttpContext>>, options: RouteOptions) =
        method(path, listOf(HttpMethod.PUT), middleware, options)

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
    fun patch(path: String, middleware: List<Middleware<HttpContext>>) =
        method(path, listOf(HttpMethod.PATCH), middleware)

    /**
     * Register a handler on a route for PATCH HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun patch(path: String, middleware: Handler<HttpContext>, options: RouteOptions) =
        method(path, listOf(HttpMethod.PATCH), middleware, options)

    /**
     * Register a handler on a route for PATCH HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun patch(path: String, middleware: List<Middleware<HttpContext>>, options: RouteOptions) =
        method(path, listOf(HttpMethod.PATCH), middleware, options)

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
    fun options(path: String, middleware: List<Middleware<HttpContext>>) =
        method(path, listOf(HttpMethod.OPTIONS), middleware)

    /**
     * Register a handler on a route for OPTIONS HTTP requests
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun options(path: String, middleware: Handler<HttpContext>, options: RouteOptions) =
        method(path, listOf(HttpMethod.OPTIONS), middleware, options)

    /**
     * Register a handler on a route for OPTIONS HTTP requests with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun options(path: String, middleware: List<Middleware<HttpContext>>, options: RouteOptions) =
        method(path, listOf(HttpMethod.OPTIONS), middleware, options)

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
    fun all(path: String, middleware: List<Middleware<HttpContext>>) =
        method(path, HttpMethod.values().toList(), middleware)

    /**
     * Register a handler on a route for all HTTP methods
     *
     * @param path A path pattern to match on
     * @param middleware A [Handler] of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun all(path: String, middleware: Handler<HttpContext>, options: RouteOptions) =
        method(path, HttpMethod.values().toList(), middleware, options)

    /**
     * Register a handler on a route for all HTTP methods with middleware
     *
     * @param path A path pattern to match on
     * @param middleware A list of [Handler]s of [HttpContext]
     * @param options Additional options to specify for the route
     */
    fun all(path: String, middleware: List<Middleware<HttpContext>>, options: RouteOptions) =
        method(path, HttpMethod.values().toList(), middleware, options)

    /**
     * Register a new route
     *
     * @param path A path pattern to match on
     * @param opts Additional route options for including middleware and security.
     */
    fun route(path: String, opts: RouteOptions) = Route(this, path, opts)

    /**
     * Register a new route
     *
     * @param path A path pattern to match on
     */
    fun route(path: String) = Route(this, path, RouteOptions())
}

internal fun ApiResource.method(
    path: String,
    methods: List<HttpMethod>,
    middleware: Handler<HttpContext>,
    opts: RouteOptions = RouteOptions()
) {
    val composedMiddleware = arrayOf(
        *this.options.middleware.toTypedArray(),
        *opts.middleware.toTypedArray(),
        Middleware { ctx: HttpContext, _: Handler<HttpContext> -> middleware(ctx) }
    )

    this.registerRoute(path, methods, *composedMiddleware)
}

internal fun ApiResource.method(
    path: String,
    methods: List<HttpMethod>,
    middleware: List<Middleware<HttpContext>>,
    opts: RouteOptions = RouteOptions()
) {
    this.registerRoute(
        path,
        methods,
        *this.options.middleware.toTypedArray(),
        *opts.middleware.toTypedArray(),
        *middleware.toTypedArray()
    )
}

internal fun ApiResource.registerRoute(
    path: String,
    methods: List<HttpMethod>,
    vararg middleware: Middleware<HttpContext>
) {
    val faas = Faas(
        ApiWorkerOptions(
            this.name,
            this.options.basePath + path,
            methods.toSet(),
            MethodOptions(this.options.security, this.options.securityDefinitions)
        )
    )
    middleware.forEach { faas.http(it) }
    Nitric.registerWorker(faas)
}