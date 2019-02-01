package edu.jspiders.springwithoutxml.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.jspiders.springwithoutxml.beans.ClassA;
import edu.jspiders.springwithoutxml.beans.ClassB;
import edu.jspiders.springwithoutxml.beans.ClassC;

@Configuration
@ComponentScan("edu.jspiders.springwithoutxml")
public class MyConfigClass {
	
	/*@Bean
	public ClassA getA()
	{
		return new ClassA();
	}

	@Bean
	public ClassB getB()
	{
		return new ClassB();
	}
	
	@Bean
	public ClassC getC()
	{
		return new ClassC();
	}*/
}
