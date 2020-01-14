package com.example.camel.fileTransfer;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyRouteBuilder myrb = new MyRouteBuilder();
    	CamelContext ctx = new DefaultCamelContext();
    	
    	try {
    		ctx.addRoutes(myrb);
    		ctx.start();
    		System.out.println(">>> START CAMEL CONTEXT");
    		Thread.sleep(5 * 1000);
    		ctx.stop();
    		System.out.println(">>> END CAMEL CONTEXT");
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
        System.out.println( "Hello World!" );
    }
}
