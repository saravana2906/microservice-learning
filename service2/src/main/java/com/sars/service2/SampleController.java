package com.sars.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SampleController {
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/sample-hello")
	public String sampleHello() {
		String service1Response = restTemplate.getForObject("http://SERVICE1/sample-hello", String.class);
		return service1Response +"Hi , from Service 2 - Hello ";
	}
}
