package edu.jspiders.implicitwiring.beans;

import org.springframework.stereotype.Component;

@Component
public class ClassB {

	public ClassB() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
}
