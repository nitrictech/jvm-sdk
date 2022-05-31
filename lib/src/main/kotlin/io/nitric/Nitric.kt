package io.nitric

import io.nitric.resources.*

object Nitric {
    internal var cache: HashMap<String, HashMap<String, Resource>> = HashMap()

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