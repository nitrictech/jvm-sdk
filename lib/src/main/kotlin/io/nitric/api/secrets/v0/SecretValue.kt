package io.nitric.api.secrets.v0

class SecretValue internal constructor(val secretVersion: SecretVersion, private val value: String) {
    fun asBytes(): ByteArray {
        return this.value.toByteArray()
    }

    fun asString(): String {
        return this.value
    }
}