package io.nitric.resources

// Singleton for managing resource registration and caching
object Resources {
    internal var cache: HashMap<String, HashMap<String, Resource>> = HashMap()

//    fun <T>collection(name: String, type: Class<T>): Collection<T> = registrar("collection", name) {
//        // create the resource type
//        Collection(name, type)
//    }

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
        Secret(name)
    }
    fun <T>collection(name: String, type: Class<T>): Collection<T> = registrar("collection", name) {
        // create the resource type
        Collection(name, type)
    }
}

// create a registrar utility resource
fun <T: Resource>Resources.registrar(type: String, name: String, creator: ()->T): T {
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