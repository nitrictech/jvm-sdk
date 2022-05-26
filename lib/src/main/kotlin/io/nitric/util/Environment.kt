package io.nitric.util

object Environment {
    val NITRIC_SERVICE_HOST_DEFAULT = "127.0.0.1"
    val NITRIC_SERVICE_PORT_DEFAULT = "50051"
    val NITRIC_SERVICE_HOST_ENV_VAR_NAME = "NITRIC_SERVICE_HOST"
    val NITRIC_SERVICE_PORT_ENV_VAR_NAME = "NITRIC_SERVICE_PORT"

    fun getOrDefault(name: String, default: String): String {
        var value = System.getenv(name)

        if (value.isEmpty()) {
            value = default
        }

        return value
    }

    fun getNitricServiceHost(): String {
        return getOrDefault(NITRIC_SERVICE_HOST_ENV_VAR_NAME, NITRIC_SERVICE_HOST_DEFAULT)
    }

    fun getNitricPort(): String {
        return getOrDefault(NITRIC_SERVICE_PORT_ENV_VAR_NAME, NITRIC_SERVICE_PORT_DEFAULT)
    }
}