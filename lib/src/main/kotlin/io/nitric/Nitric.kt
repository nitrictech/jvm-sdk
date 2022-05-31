package io.nitric

import io.nitric.faas.v0.Faas
import io.nitric.resources.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

object Nitric {
    internal val workers: ArrayList<Faas> = ArrayList()
    internal var cache: HashMap<String, HashMap<String, Resource>> = HashMap()

    internal fun registerWorker(faas: Faas) {
        // Register a FaaS object
        this.workers.add(faas)
    }

    // Required for blocking
    fun run() = runBlocking {
        // start each Faas instance in a go routine
        for (worker in workers) {
            launch { worker.start() }
        }
    }

    fun api(name: String): ApiResource {
        return ApiResource(name)
    }

    fun schedule(description: String): ScheduleResource {
        return ScheduleResource(description)
    }

    fun queue(name: String) = registrar("queue", name) {
        QueueResource(name)
    }

    fun topic(name: String): TopicResource = registrar("topic", name) {
        TopicResource(name)
    }

    fun bucket(name: String): BucketResource = registrar("bucket", name) {
        BucketResource(name)
    }

    fun <T>secret(name: String, type: Class<T>) = registrar("secret", name) {
        // create the resource type
        SecretResource(name)
    }
    fun <T>collection(name: String, type: Class<T>)= registrar("collection", name) {
        // create the resource type
        CollectionResource(name, type)
    }
}

fun <T: Resource> Nitric.registrar(type: String, name: String, creator: ()->T): T {
    // create cache if one doesn't exist
    if (this.cache[type] == null) {
        this.cache[type] = HashMap()
    }

    // return cached resource if one exists
    if (this.cache[type]?.get(name) != null) {
        return this.cache[type]?.get(name) as T
    }

    // create and register and cache the resource
    val res = creator()
    res.register()
    this.cache[type]?.set(name, res)

    return res
}