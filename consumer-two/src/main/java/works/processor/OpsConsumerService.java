package works.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import core.models.RequestTwo;

@Service
public class OpsConsumerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OpsConsumerService.class);

    @StreamListener(Sink.CHANNEL_NAME)
    public void process(RequestTwo request) {
        LOGGER.info("Received request"+request.toString());
    }
}
