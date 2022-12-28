package io.nitric.api.secrets

import com.google.protobuf.kotlin.toByteStringUtf8
import io.mockk.coEvery
import io.mockk.mockk
import io.nitric.api.secrets.v0.Secret
import io.nitric.proto.secret.v1.SecretAccessResponse
import io.nitric.proto.secret.v1.SecretPutResponse
import io.nitric.proto.secret.v1.SecretServiceGrpcKt
import io.nitric.proto.secret.v1.SecretVersion
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.TestInstance
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class SecretVersionTest {
    val client: SecretServiceGrpcKt.SecretServiceCoroutineStub = mockk(relaxed = true)

    @Test
    fun testBuild() {
        val secret = Secret(client, "secret")

        val version = secret.version("test-version")

        assertNotNull(version)
        assertEquals("test-version", version.version)
        assertEquals(secret, version.secret)
    }

    @Test
    fun testAccess() {
        val secret = Secret(client, "secret")

        val version = secret.version("test-version")

        coEvery { client.access(allAny()) } returns
                SecretAccessResponse.newBuilder()
                    .setSecretVersion(
                        SecretVersion.newBuilder()
                            .setVersion("test-version")
                            .setSecret(io.nitric.proto.secret.v1.Secret.newBuilder().setName("secret")).build()
                    )
                    .setValue("super secret secret".toByteStringUtf8())
                    .build()

        val value = runBlocking {
            version.access()
        }

        assertNotNull(value)
        assertEquals("super secret secret", value.toString())
        assertEquals("test-version", value.secretVersion.version)
        assertEquals("secret", value.secretVersion.secret.name)
    }
}