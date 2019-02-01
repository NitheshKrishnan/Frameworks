package edu.jspiders.setterinjection.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.setterinjection.beans.ClassA;
import edu.jspiders.setterinjection.beans.ClassB;

public class SetterUtil {

	public static void main(String[] args) {
		
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
	
		//Use the Bean
		ClassA a1 = (ClassA) context.getBean("a");
		ClassB b1 = (ClassB) context.getBean("b");
		
		System.out.println(a1);
		System.out.println(b1);
		
		// Close the Container
		context.close();
	}
}
