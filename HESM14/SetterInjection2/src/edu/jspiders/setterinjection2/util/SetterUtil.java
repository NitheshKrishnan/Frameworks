package edu.jspiders.setterinjection2.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.setterinjection2.beans.Pen;

public class SetterUtil {

	public static void main(String[] args) {
		
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		Pen pen = (Pen) context.getBean("gel");
		
		pen.getPenBrand();
		pen.getPenType();
		pen.getPenPrice();
		
		System.out.println(pen);
		
		// close the Container
		context.close();
	}
}
