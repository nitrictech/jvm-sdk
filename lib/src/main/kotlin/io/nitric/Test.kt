package io.nitric

import io.nitric.api.queues.v0.Task
import io.nitric.faas.v0.Frequency
import io.nitric.faas.v0.HttpContext
import io.nitric.faas.v0.Middleware
import io.nitric.resources.ApiOptions
import io.nitric.resources.BucketPermission
import io.nitric.resources.CollectionPermission
import io.nitric.resources.QueuePermission
import kotlinx.coroutines.runBlocking

class User(val name: String)

fun main() {
    val api = Nitric.api("main")

    val bucket = Nitric.bucket("bucket").with()

    bucket.file("cat.png").write("")

    bucket.files()

    Nitric.run()
}