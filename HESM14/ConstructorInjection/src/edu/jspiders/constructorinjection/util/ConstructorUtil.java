package edu.jspiders.constructorinjection.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.constructorinjection.beans.ClassA;
import edu.jspiders.constructorinjection.beans.ClassB;

public class ConstructorUtil {

	public static void main(String[] args) {
		
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		ClassA a = context.getBean(ClassA.class);
		ClassB b = context.getBean(ClassB.class);
		
		System.out.println(a);
		System.out.println(b);
		
		// Close the Container
		context.close();
		
	}
}