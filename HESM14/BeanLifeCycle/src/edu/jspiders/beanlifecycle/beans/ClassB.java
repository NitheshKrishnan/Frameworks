package edu.jspiders.beanlifecycle.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class ClassB {

	public ClassB() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	@PostConstruct
	public void MyOwnPostInitialization()
	{
		System.out.println(this.getClass().getSimpleName()+" MyOwnPostInitialization() invoked");
	}
	
	@PreDestroy
	public void MyOwnDestroy()
	{
		System.out.println(this.getClass().getSimpleName()+" MyOwnDestroy() invoked");
	}
}
