package io.nitric.util

import java.util.logging.Logger

/**
 * Creates a fluent function
 */
fun <T: Any> T.fluently(func: ()->Unit): T {
    func()
    return this
}

fun Logger.error(error: Throwable?, msg: String) {
    this.log(java.util.logging.Level.SEVERE, "${msg}: ${error?.message}")
}