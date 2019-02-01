package edu.jspiders.beanlifecycle.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.beanlifecycle.beans.ClassA;
import edu.jspiders.beanlifecycle.beans.ClassB;

public class Util {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		ClassA a = context.getBean(ClassA.class);
		System.out.println(a);
		
		ClassB b = context.getBean(ClassB.class);
		System.out.println(b);
		
		context.close();
	}
}
