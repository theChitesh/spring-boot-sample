package com.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.demo.*")
public class DemoApp {

	public static void main(String[] args) {
		
		System.out.println("Ready to start");
		SpringApplication.run(DemoApp.class, args);

	}

}
