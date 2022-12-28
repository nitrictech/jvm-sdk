import io.mockk.coEvery
import io.mockk.mockk
import io.nitric.api.events.v0.EventingClients
import io.nitric.api.events.v0.NitricEvent
import io.nitric.api.events.v0.Topic
import io.nitric.proto.event.v1.EventPublishResponse
import io.nitric.proto.event.v1.EventServiceGrpcKt
import io.nitric.proto.event.v1.TopicServiceGrpcKt
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.TestInstance
import kotlin.test.*

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class TopicTest {
    private val eventsClient: EventServiceGrpcKt.EventServiceCoroutineStub = mockk()
    private val topicsClient: TopicServiceGrpcKt.TopicServiceCoroutineStub = mockk()
    private val client = EventingClients(eventsClient, topicsClient)

    @Test
    fun testBuild() {
        val event = NitricEvent(payload=mapOf("test" to "payload"), id="1234", payloadType="test-payload")

        assertEquals("1234", event.id)
        assertEquals("test-payload", event.payloadType)
        assertEquals("payload", event.payload["test"])
    }

    @Test
    fun testBuildWithDefaults() {
        val event = NitricEvent(payload=mapOf("test" to "payload"))

        assertEquals("none", event.payloadType)

        // Test that the id is a uuid by: length of 36, 4 dashes, and a version 4 uuid
        assertEquals(36, event.id.length)
        assertEquals(4, event.id.count{ char -> char == '-' })
        assertEquals('4', event.id[14])
    }

    @Test
    fun testToWire() {
        val event = NitricEvent(payload=mapOf("test" to "payload"), id="1234", payloadType="test-payload")

        val wireEvent = event.toWire()

        assertNotNull(wireEvent)
        assertEquals("1234", wireEvent.id)
        assertEquals("test-payload", wireEvent.payloadType)
        assertTrue(wireEvent.payload.containsFields("test"))
    }

    @Test
    fun testPublish() {
        val event = NitricEvent(payload=mapOf("test" to "payload"), id="1234", payloadType="test-payload")

        val topic = Topic(client, "test-topic")

        coEvery { eventsClient.publish(allAny()) } returns EventPublishResponse.newBuilder().setId("1234").build()

        val resp = runBlocking {
            topic.publish(event)
        }

        assertEquals(event.id, resp.id)
        assertEquals(event.payload, resp.payload)
        assertEquals(event.payloadType, resp.payloadType)
    }
}