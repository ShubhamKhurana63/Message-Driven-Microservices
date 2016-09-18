package core.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestOne {

	private final String id;
	private final String definition;

	@JsonCreator
	public RequestOne(@JsonProperty("id") String id, @JsonProperty("definition") String definition) {
		this.id = id;
		this.definition = definition;
	}

	public String getId() {
		return id;
	}

	public String getDefinition() {
		return definition + "I am from RequestOne";
	}

}
