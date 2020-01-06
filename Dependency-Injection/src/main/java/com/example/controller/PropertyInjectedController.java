package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.service.GreetingService;

@Component
public class PropertyInjectedController {
	
	@Autowired
	@Qualifier("propertyInjectedServicesImpl")
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayHello();
	}

}
