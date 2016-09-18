package works.processor;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Sink {
    String CHANNEL_NAME = "sourceTwoChannel";

    @Input
    SubscribableChannel sourceTwoChannel();
}
