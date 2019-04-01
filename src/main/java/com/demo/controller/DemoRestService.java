package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.services.DemoService;

@RestController
public class DemoRestService {
	
	@Autowired
	private DemoService service;
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("inside test");
		
		String value = service.testService();
		System.out.println(value);
		return "Hello Anusha, Spring Boot is working";
	}

}
