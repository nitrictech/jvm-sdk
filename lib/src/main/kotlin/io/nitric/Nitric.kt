package io.nitric

import io.nitric.faas.v0.Faas
import io.nitric.resources.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Nitric resource manager
 */
object Nitric {
    internal val workers: ArrayList<Faas> = ArrayList()
    internal var cache: HashMap<String, HashMap<String, Resource>> = HashMap()

    internal fun registerWorker(faas: Faas) {
        // Register a FaaS object
        this.workers.add(faas)
    }

    /**
     * Start running the nitric application. This will typically be called at the end of an application
     */
    fun run() = runBlocking {
        // start each Faas instance in a go routine
        for (worker in workers) {
            launch { worker.start() }
        }
    }

    /**
     * Declares a new nitric api resource
     *
     * @param name the name of the API resource
     * @return [ApiResource]
     */
    fun api(name: String): ApiResource {
        return ApiResource(name)
    }

    /**
     * Declares a new schedule
     *
     * @param description A description for the schedule
     * @return [ScheduleResource]
     */
    fun schedule(description: String): ScheduleResource {
        return ScheduleResource(description)
    }

    /**
     * Declares a new queue resource
     *
     * @param name The name of the queue
     * @return [QueueResource]
     */
    fun queue(name: String) = registrar("queue", name) {
        QueueResource(name)
    }

    /**
     * Declares a new topic resource
     *
     * @param name The name of the topic
     * @return [TopicResource]
     */
    fun topic(name: String): TopicResource = registrar("topic", name) {
        TopicResource(name)
    }

    /**
     * Declares a new bucket resource
     *
     * @param name The name of the bucket
     * @return [BucketResource]
     */
    fun bucket(name: String): BucketResource = registrar("bucket", name) {
        BucketResource(name)
    }

    /**
     * Declares a new secret
     *
     * @param name The name of the secret
     * @return [SecretResource]
     */
    fun <T>secret(name: String) = registrar("secret", name) {
        // create the resource type
        SecretResource(name)
    }

    /**
     * Declares a new collection resource
     *
     * @param name The name of the collection
     * @param type The type of data to store in the collections documents
     * @return [CollectionResource]
     */
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