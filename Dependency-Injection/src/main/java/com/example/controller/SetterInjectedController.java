package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.service.GreetingService;

@Controller
public class SetterInjectedController {
	
	private GreetingService greetingService;

	public GreetingService getGreetingService() {
		return greetingService;
	}

	@Autowired
	@Qualifier("setterInjectedServicesImpl")
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayHello();	
	}
	
}
