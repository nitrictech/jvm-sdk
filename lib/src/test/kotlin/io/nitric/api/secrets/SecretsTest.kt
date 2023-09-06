package io.nitric.api.secrets

import io.nitric.api.secrets.v0.Secrets
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.Test

class SecretsTest {
    @Test
    fun testCreateSecret() {
        val secret = Secrets.secret("test-secret")

        assertNotNull(secret)
        assertEquals("test-secret", secret.name)
    }
}