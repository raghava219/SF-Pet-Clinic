package com.example.camel;

public class MyTransform {
	
	public String TransformContent(String body) {
		String upperCaseContent = body.toUpperCase();
		return upperCaseContent;
	}

}
