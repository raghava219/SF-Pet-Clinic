package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedServicesImpl implements GreetingService {

	private static final String SETTER_HELLO = "Hello from - Generic ServiceImpl - Setter";
	
	@Override
	public String sayHello() {
		return SETTER_HELLO;
	}

}
