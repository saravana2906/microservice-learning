package com.sars.service2;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;

@Service
public class SampleService {

	
	@Autowired
	RestTemplate restTemplate;
	
	
	@CircuitBreaker(name= "service1",fallbackMethod = "onService1Failure")
//	@TimeLimiter(name="service1",fallbackMethod = "onService1Failure")
	public String callService1() {
		return  restTemplate.getForObject("http://SERVICE1/sample-hello", String.class);
	}
	
	public String onService1Failure(Exception e) {
		return "Service1 failure";
	}
}
