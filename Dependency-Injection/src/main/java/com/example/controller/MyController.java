package com.example.controller;

import org.springframework.stereotype.Controller;

import com.example.service.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String hello() {
		System.out.println("Hello !!!");
		return greetingService.sayHello();
	}

}
