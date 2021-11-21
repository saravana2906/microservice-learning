package com.sars.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class SampleController {
	
	@Autowired
	SampleService sampleService;

	
	@GetMapping("/sample-hello")
	public String sampleHello() {
		String service1Response = sampleService.callService1();
		return service1Response +"Hi , from Service 2 - Hello ";
	}
	
}
