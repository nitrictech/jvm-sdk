import io.mockk.mockk
import io.nitric.api.secrets.v0.SecretValue
import io.nitric.api.secrets.v0.SecretVersion
import io.nitric.proto.secret.v1.SecretServiceGrpcKt.SecretServiceCoroutineStub
import org.junit.jupiter.api.TestInstance
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class SecretValueTest {
    val version: SecretVersion = mockk()

    @Test
    fun testBuild() {
        val secretValue = SecretValue(version, "this is secret")

        assertNotNull(secretValue.secretVersion)
        assertEquals("this is secret", secretValue.toString())
        assertContentEquals("this is secret".toByteArray(), secretValue.toByteArray())
    }
}