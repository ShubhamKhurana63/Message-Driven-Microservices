package works.service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import core.models.RequestOne;
import core.models.RequestTwo;

@MessagingGateway
public interface SourceMessageGateway {
	@Gateway(requestChannel = Source.CHANNEL_ONE)
	void generateRequestOne(RequestOne request);

	@Gateway(requestChannel = Source.CHANNEL_TWO)
	void generateRequestTwo(RequestTwo request);

}
