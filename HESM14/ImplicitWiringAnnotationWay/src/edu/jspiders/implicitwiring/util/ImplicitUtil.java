package edu.jspiders.implicitwiring.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.implicitwiring.beans.ClassA;

public class ImplicitUtil {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		ClassA a = context.getBean(ClassA.class);
		
		System.out.println(a);
		
		context.close();
		
	}
}
