import io.mockk.coEvery
import io.mockk.mockk
import io.nitric.api.secrets.v0.Secret
import io.nitric.proto.secret.v1.SecretPutResponse
import io.nitric.proto.secret.v1.SecretServiceGrpc
import kotlinx.coroutines.runBlocking
import io.nitric.proto.secret.v1.SecretVersion as ProtoSecretVersion
import io.nitric.proto.secret.v1.Secret as ProtoSecret
import org.junit.jupiter.api.TestInstance
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class SecretTest {
    val client: SecretServiceGrpc.SecretServiceBlockingStub = mockk(relaxed = true)

    @Test
    fun testBuild() {
        val secret = Secret(client, "secret")

        assertEquals("secret", secret.name)
        assertNotNull(secret.client)
    }

    @Test
    fun testToWire() {
        val secret = Secret(client, "secret")

        val wireSecret = secret.toWire()

        assertEquals("secret", wireSecret.name)
    }

    @Test
    fun testPut() {
        val secret = Secret(client, "secret")

        coEvery { client.put(allAny()) } returns
                SecretPutResponse.newBuilder()
                    .setSecretVersion(
                        ProtoSecretVersion.newBuilder()
                            .setVersion("1234")
                            .setSecret(ProtoSecret.newBuilder().setName("secret")).build()
                    )
                    .build()

        val version = runBlocking {
            secret.put("api-key-v1")
        }

        assertEquals("1234", version.version)
        assertEquals("secret", version.secret.name)
    }

    @Test
    fun testVersion() {
        val secret = Secret(client, "secret")

        val version = secret.version("test-version")

        assertNotNull(version)
        assertEquals("secret", version.secret.name)
        assertEquals("test-version", version.version)
    }

    @Test
    fun testLatest() {
        val secret = Secret(client, "secret")

        val version = secret.latest()

        assertNotNull(version)
        assertEquals("secret", version.secret.name)
        assertEquals("latest", version.version)
    }
}