package edu.jspiders.myfirstspringapp.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.myfirstspringapp.beans.ClassA;
import edu.jspiders.myfirstspringapp.beans.ClassB;
import edu.jspiders.myfirstspringapp.beans.ClassC;

public class SpringUtil {
	
	public static void main(String[] args) {
		
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
	
	
		// Use the Bean
		ClassA a = (ClassA) context.getBean("a");
		ClassB b = (ClassB) context.getBean("b");
		ClassC c = (ClassC) context.getBean("c");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// Close the Container
		context.close();
	}
}