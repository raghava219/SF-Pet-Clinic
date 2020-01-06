package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.service.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	private GreetingService greetingService;
	
	@Autowired
	public ConstructorInjectedController(@Qualifier("constructorInjectedServicesImpl") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayHello();
	}

}
