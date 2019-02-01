package edu.jspiders.springwithoutxml.util;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jspiders.springwithoutxml.config.MyConfigClass;

public class Util {

	public static void main(String[] args) {
		
		// Create the Container
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MyConfigClass.class);
		
		// USe the Bean
		
		// Close the container
		context.close();
	}
}
