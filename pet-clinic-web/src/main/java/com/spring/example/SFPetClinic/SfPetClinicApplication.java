package com.spring.example.SFPetClinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.spring.example")
public class SfPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfPetClinicApplication.class, args);
	}

}
