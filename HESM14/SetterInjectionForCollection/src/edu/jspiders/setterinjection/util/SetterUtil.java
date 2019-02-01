package edu.jspiders.setterinjection.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.setterinjection.beans.ClassA;
import edu.jspiders.setterinjection.beans.ClassB;
import edu.jspiders.setterinjection.beans.ClassC;

public class SetterUtil {
	
	public static void main(String[] args) {
		
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		
		ClassA a = context.getBean(ClassA.class);
		ClassB b = context.getBean(ClassB.class);
		ClassC c = context.getBean(ClassC.class);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// close the container
		context.close();
		
	}

}
