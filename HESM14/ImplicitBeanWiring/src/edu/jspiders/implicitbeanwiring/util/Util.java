package edu.jspiders.implicitbeanwiring.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.implicitbeanwiring.beans.ClassA;

public class Util {

	public static void main(String[] args) {
		// Create the container
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the bean
		ClassA a = context.getBean(ClassA.class);
		
		System.out.println(a);
		
		// close the container
		context.close();
	}
}
