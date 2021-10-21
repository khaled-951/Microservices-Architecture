package com.esprit.evenements;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenementRestAPI {
	private String title="Hello event";
	
	@RequestMapping("/hello")
	private String sayHello() {
		System.out.println(title);
		return title;
	}

}
