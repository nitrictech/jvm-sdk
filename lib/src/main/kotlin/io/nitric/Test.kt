package io.nitric

import io.nitric.api.queues.v0.Task
import io.nitric.resources.BucketPermission
import io.nitric.resources.CollectionPermission
import io.nitric.resources.QueuePermission
import kotlinx.coroutines.runBlocking

class User(val name: String)

fun main() {
    val api = Nitric.api("main")

    api.get("/hello/:name", { ctx ->
        val name = ctx.req.params["name"]
        ctx.resp.text("Hello $name")
        ctx
    })

    Nitric.run()
}