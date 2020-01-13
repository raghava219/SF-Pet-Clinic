package com.example.camel;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C:\\datafiles\\input?noop=true")
        .process(new MyLogProcessor())
        .bean(new MyTransform(), "TransformContent")
        .process(new MyLogProcessor())
        .to("file:C:\\datafiles\\output");
	}

	
}
