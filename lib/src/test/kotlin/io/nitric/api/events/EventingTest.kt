import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import io.nitric.api.events.v0.Eventing
import io.nitric.api.events.v0.EventingClients
import io.nitric.proto.event.v1.EventServiceGrpc
import io.nitric.proto.event.v1.EventServiceGrpcKt.EventServiceCoroutineStub
import io.nitric.proto.event.v1.NitricTopic
import io.nitric.proto.event.v1.TopicListResponse
import io.nitric.proto.event.v1.TopicServiceGrpc
import io.nitric.proto.event.v1.TopicServiceGrpcKt.TopicServiceCoroutineStub
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.TestInstance
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class EventingClientsTest {
    @Test
    fun testBuild() {
        val eventsClient: EventServiceGrpc.EventServiceBlockingStub = mockk(relaxed = true)
        val topicsClient: TopicServiceGrpc.TopicServiceBlockingStub = mockk(relaxed = true)
        val clients = EventingClients(eventsClient, topicsClient)

        assertNotNull(clients)
        assertEquals(clients.event, eventsClient)
        assertEquals(clients.topic, topicsClient)
    }
}

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class EventingTest {
    private val eventsClient: EventServiceGrpc.EventServiceBlockingStub = mockk()
    private val topicsClient: TopicServiceGrpc.TopicServiceBlockingStub = mockk()
    private val client = EventingClients(eventsClient, topicsClient)

    @Test
    fun testBuild() {
        val topic = Eventing.topic("test-topic")

        assertNotNull(topic)
        assertEquals("test-topic", topic.name)
    }

    @Test
    fun testListTopics() {
        coEvery { topicsClient.list(allAny()) } returns
                TopicListResponse.newBuilder()
                    .addTopics(NitricTopic.newBuilder().setName("test-topic").build())
                    .build()

        val topics = runBlocking {
            Eventing.topics(client)
        }

        coVerify(exactly=1) { topicsClient.list(allAny()) }

        assertEquals(1, topics.size)
        assertEquals("test-topic", topics[0].name)
    }

    @Test
    fun testListNoTopics() {
        coEvery { topicsClient.list(allAny()) } returns TopicListResponse.newBuilder().addAllTopics(listOf()).build()

        val topics = runBlocking {
            Eventing.topics(client)
        }

        coVerify(exactly=1) { topicsClient.list(allAny()) }

        assertEquals(0, topics.size)
    }
}