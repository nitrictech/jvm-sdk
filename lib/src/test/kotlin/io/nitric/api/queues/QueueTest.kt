import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.mockk.*
import io.nitric.api.queues.v0.*
import io.nitric.proto.queue.v1.QueueReceiveResponse
import io.nitric.proto.queue.v1.QueueSendBatchResponse
import io.nitric.proto.queue.v1.QueueServiceGrpc
import kotlinx.coroutines.*
import org.junit.jupiter.api.TestInstance
import kotlin.test.*
import kotlin.test.Test
import io.nitric.proto.queue.v1.FailedTask as ProtoFailedTask

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class QueueTest() {
    private val clientMock: QueueServiceGrpc.QueueServiceBlockingStub = mockk(relaxed = true)
    private val queue = Queue(clientMock, "test-queue")

    private val task = Task(payload=mapOf("test" to "payload"), leaseId="1234", id="5678", payloadType="test-payload")

    @Test
    fun testSend() {
        val failedTask = runBlocking {
            queue.send(task)
        }

        coVerify(exactly = 1) {
            clientMock.send(allAny())
        }

        assertNull(failedTask)
    }

    @Test
    fun testSendThrowsError() {
        coEvery { clientMock.send(allAny()) } throws StatusRuntimeException(Status.INTERNAL)

        val failedTask = runBlocking {
            queue.send(task)
        }

        coVerify(exactly=1) {
            clientMock.send(allAny())
        }

        assertNotNull(failedTask)
        assertEquals("INTERNAL", failedTask.message)
        assertEquals("5678", failedTask.task.id)
        assertEquals("1234", failedTask.task.leaseId)
        assertEquals("payload", failedTask.task.payload?.get("test"))
        assertEquals("test-payload", failedTask.task.payloadType)
    }

    @Test
    fun testSendBatch() {
        val failedTasks = runBlocking {
            queue.send(task, task, task, task)
        }

        coVerify(exactly=1){
            clientMock.sendBatch(allAny())
        }

        assertEquals(0, failedTasks.size)
    }

    @Test
    fun testSendBatchReturnsFailedTasks() {
        coEvery { clientMock.sendBatch(allAny()) } returns
            QueueSendBatchResponse
                .newBuilder()
                .addFailedTasks(
                    ProtoFailedTask.newBuilder().setTask(task.toWire()).setMessage("task failed to send").build()
                )
                .build()

        val failedTasks = runBlocking {
            queue.send(task, task, task, task)
        }

        coVerify(exactly=1){
            clientMock.sendBatch(allAny())
        }

        assertEquals(1, failedTasks.size)
        assertEquals("task failed to send", failedTasks[0].message)
        assertEquals("5678", failedTasks[0].task.id)
        assertEquals("1234", failedTasks[0].task.leaseId)
        assertEquals("payload", failedTasks[0].task.payload?.get("test"))
        assertEquals("test-payload", failedTasks[0].task.payloadType)
    }

    @Test
    fun testReceive() {
        coEvery { clientMock.receive(allAny()) } returns
            QueueReceiveResponse
                .newBuilder()
                .addAllTasks(listOf(task.toWire()))
                .build()


        val tasks = runBlocking {
            queue.receive()
        }

        coVerify(exactly=1){
            clientMock.receive(allAny())
        }

        assertEquals(1, tasks.size)
        assertEquals("1234", task.leaseId)
        assertEquals("5678", task.id)
        assertEquals("test-payload", task.payloadType)
        assertEquals("payload", task.payload?.get("test"))
    }

    @Test
    fun testReceiveZeroTasks() {
        coEvery { clientMock.receive(allAny()) } returns
                QueueReceiveResponse
                    .newBuilder()
                    .addAllTasks(listOf())
                    .build()


        val tasks = runBlocking {
            queue.receive()
        }

        coVerify(exactly=1){
            clientMock.receive(allAny())
        }

        assertEquals(0, tasks.size)
    }
}

