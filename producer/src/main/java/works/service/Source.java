package works.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Source {

	String CHANNEL_ONE = "sourceOneChannel";

	String CHANNEL_TWO = "sourceTwoChannel";

	@Output
	MessageChannel sourceOneChannel();

	@Output
	MessageChannel sourceTwoChannel();

}
