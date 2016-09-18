package works.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import core.models.RequestOne;

@Service
@EnableBinding(Sink.class)
public class WorkHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(WorkHandler.class);

    @StreamListener(Sink.CHANNEL_NAME)
    public void process(RequestOne workUnit) {
        LOGGER.info("Handling work unit - id: {}, definition: {}", workUnit.getId(), workUnit.getDefinition());
    }
}
