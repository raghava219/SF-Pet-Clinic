package com.example.camel.activemq;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C:/inputFolder").split().tokenize("\n").to("jms:queue:javainuse");
	}
	

}
