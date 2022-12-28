import io.nitric.api.queues.v0.Queueing
import kotlin.test.Test
import kotlin.test.assertEquals

class QueueingTest {
    @Test
    fun testCreateQueue() {
        val queue = Queueing.queue("test-queue")

        assertEquals("test-queue", queue.name)
    }
}