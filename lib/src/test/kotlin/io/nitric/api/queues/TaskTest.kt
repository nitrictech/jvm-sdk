import com.google.protobuf.Struct
import com.google.protobuf.Value
import io.mockk.coVerify
import io.mockk.mockk
import io.nitric.api.queues.v0.FailedTask
import io.nitric.api.queues.v0.Queue
import io.nitric.api.queues.v0.ReceivedTask
import io.nitric.api.queues.v0.Task
import io.nitric.proto.queue.v1.NitricTask
import io.nitric.proto.queue.v1.QueueServiceGrpcKt
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.TestInstance
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TaskTest {
    @Test
    fun testBuild() {
        val task = Task(payload=mapOf("test" to "payload"), leaseId="1234", id="5678", payloadType="test-payload")

        assertEquals("5678", task.id)
        assertEquals("1234", task.leaseId)
        assertEquals("test-payload", task.payloadType)
        assertEquals("payload", task.payload?.get("test"))
    }

    @Test
    fun testToWire() {
        val task = Task(payload=mapOf("test" to "payload"), leaseId="1234", id="5678", payloadType="test-payload")

        val wireTask = task.toWire()

        assertEquals("5678", wireTask.id)
        assertEquals("1234", wireTask.leaseId)
        assertEquals("test-payload", wireTask.payloadType)
        assert(wireTask.payload.containsFields("test"))
    }

}

class FailedTaskTest {
    @Test
    fun testBuild() {
        val task = Task(payload=mapOf("test" to "payload"), leaseId="1234", id="5678", payloadType="test-payload")

        val failedTask = FailedTask(task, "test failure message")

        assertEquals(failedTask.task.id, "5678")
        assertEquals(failedTask.task.leaseId, "1234")
        assertEquals(failedTask.task.payloadType, "test-payload")
        assertEquals(failedTask.task.payload?.get("test"), "payload")
        assertEquals(failedTask.message, "test failure message")
    }
}

class ReceivedTaskTest {
    private val clientMock: QueueServiceGrpcKt.QueueServiceCoroutineStub = mockk(relaxed = true)
    private val queue = Queue(clientMock, "test-queue")

    @Test
    fun testBuild() {
        val receivedTask = ReceivedTask(queue, id="1234", leaseId="5678", payloadType = "test-payload", payload=mapOf("test" to "payload"))

        assertEquals("1234", receivedTask.id)
        assertEquals("5678", receivedTask.leaseId)
        assertEquals("test-payload", receivedTask.payloadType)
        assertEquals("payload", receivedTask.payload?.get("test"))
    }


    @Test
    fun testToWire() {
        val receivedTask = ReceivedTask(queue, id="1234", leaseId="5678", payloadType = "test-payload", payload=mapOf("test" to "payload"))

        val wireTask = receivedTask.toWire()

        assertEquals("1234", wireTask.id)
        assertEquals("5678", wireTask.leaseId)
        assertEquals("test-payload", wireTask.payloadType)
        assertTrue(wireTask.payload.containsFields("test"))
    }

    @Test
    fun testFromWire() {
        val protoPayload = Struct.newBuilder().putAllFields(
            mapOf("test" to Value.newBuilder().setStringValue("payload").build())
        )

        val protoTask = NitricTask.newBuilder()
            .setId("1234")
            .setLeaseId("5678")
            .setPayloadType("test-payload")
            .setPayload(protoPayload)
            .build()

        val receivedTask = ReceivedTask.fromWire(queue, protoTask)

        assertEquals("1234", receivedTask.id)
        assertEquals("5678", receivedTask.leaseId)
        assertEquals("test-payload", receivedTask.payloadType)
        assertEquals("payload", receivedTask.payload?.get("test"))
    }

    @Test
    fun testComplete() {
        val receivedTask = ReceivedTask(queue, id="1234", leaseId="5678", payloadType = "test-payload", payload=mapOf("test" to "payload"))

        runBlocking {
            receivedTask.complete()
        }

        coVerify(exactly = 1) { clientMock.complete(allAny()) }
    }
}