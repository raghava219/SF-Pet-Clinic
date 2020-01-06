package com.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingServiceImpl implements GreetingService {

	private static final String HELLO_PRIMARY = "Hello - Primary Greeting service";
	
	@Override
	public String sayHello() {
		return HELLO_PRIMARY;
	}

}
