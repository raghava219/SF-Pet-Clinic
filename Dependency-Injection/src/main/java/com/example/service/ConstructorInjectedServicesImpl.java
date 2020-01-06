package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedServicesImpl implements GreetingService {

	public static final String HELLO_STRING = "Hello from - Generic ServiceImpl - Constructor";
	
	@Override
	public String sayHello() {
		return HELLO_STRING;
	}

}
