package edu.jspiders.implicitwiring.beans;

import org.springframework.stereotype.Component;

@Component("classb")
public class ClassB implements C{

	public ClassB() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
}
