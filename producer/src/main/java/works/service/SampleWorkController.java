package works.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import core.models.RequestOne;
import core.models.RequestTwo;

@RestController
public class SampleWorkController {

	@Autowired
	private SourceMessageGateway workUnitGateway;

	int counterOne = 0;
	int counterTwo = 0;

	@RequestMapping("/generateWorkOne")
	@ResponseBody
	public RequestOne generateWorkOne(@RequestParam("definition") String definition) {
		RequestOne request = new RequestOne(String.valueOf(counterOne), definition);
		workUnitGateway.generateRequestOne(request);
		counterOne++;
		return request;
	}

	@RequestMapping("/generateWorkTwo")
	@ResponseBody
	public RequestTwo generateWorkTwo(@RequestParam("definition") String definition) {
		RequestTwo request = new RequestTwo(String.valueOf(counterTwo), definition);
		workUnitGateway.generateRequestTwo(request);
		counterTwo++;
		return request;
	}
}
