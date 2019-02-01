package edu.jspiders.myspringapp.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.myspringapp.beans.ClassA;

public class SpringUtil {

	public static void main(String[] args) {
		
		//Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
	
		// Use the Bean
		ClassA a1 = (ClassA) context.getBean("a");
		
		System.out.println(a1);
		
		// CLose the COntainer
		context.close();
	}
}
