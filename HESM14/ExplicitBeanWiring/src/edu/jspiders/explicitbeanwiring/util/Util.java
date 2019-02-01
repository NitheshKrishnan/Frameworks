package edu.jspiders.explicitbeanwiring.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.explicitbeanwiring.bean.ClassA;

public class Util {

	public static void main(String[] args) {
		
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		ClassA a = context.getBean(ClassA.class);
		
		System.out.println(a);
		
		// close the cotainer
		context.close();
	}
}
