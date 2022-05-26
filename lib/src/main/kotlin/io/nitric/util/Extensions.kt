package io.nitric.util

/**
 * Creates a fluent function
 */
fun <T: Any> T.fluently(func: ()->Unit): T {
    func()
    return this
}