package com.esprit.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestAPI {
	
	@GetMapping("/hi")
	public String test() {
		return "hi";
	}

}
