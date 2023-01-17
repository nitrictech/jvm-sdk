vpackage io.nitric;

import io.nitric.Nitric;
import io.nitric.api.events.v0.NitricEvent;
import io.nitric.api.queues.v0.Queue;
import io.nitric.api.queues.v0.Task;
import io.nitric.faas.v0.Frequency;
import io.nitric.resources.BucketPermission;
import io.nitric.resources.QueuePermission;
import io.nitric.resources.TopicPermission;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class Test {
    public static void main(String[] args) {

        var bucket = Nitric.INSTANCE.bucket("images").with(BucketPermission.Read);

        var api = Nitric.INSTANCE.api("main");

        var topic = Nitric.INSTANCE.topic("topic");

        topic.subscribe(List.of((ctx, next) -> {
            // process event
            return next.invoke(ctx);
        }, (ctx, next) -> {
            // process event
            return next.invoke(ctx);
        }));

        Nitric.INSTANCE.run();
    }
}

