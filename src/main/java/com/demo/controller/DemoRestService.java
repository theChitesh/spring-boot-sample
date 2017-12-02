package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestService {
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("inside test");
		return "Hello Lipsa, Spring Boot is working";
	}

}
