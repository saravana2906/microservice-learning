package com.sars.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/sample-hello")
	public String sampleHello() {
		return "Hi , from Service 1 - Hello ";
	}
}
