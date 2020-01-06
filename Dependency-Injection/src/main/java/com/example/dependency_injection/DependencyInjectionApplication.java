package com.example.dependency_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.ConstructorInjectedController;
import com.example.controller.MyController;
import com.example.controller.PropertyInjectedController;
import com.example.controller.SetterInjectedController;

@SpringBootApplication
@ComponentScan("com.example")
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController");
		
		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		
		System.out.println(myController.hello());
		System.out.println(propertyInjectedController.sayHello());
		System.out.println(constructorInjectedController.sayHello());
		System.out.println(setterInjectedController.sayHello());
		
	}

}
