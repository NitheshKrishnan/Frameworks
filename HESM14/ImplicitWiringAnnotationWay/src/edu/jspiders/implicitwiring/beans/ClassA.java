package edu.jspiders.implicitwiring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassA {
	
	public ClassA() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	@Autowired
	public ClassA(ClassB b) {
		System.out.println(this.getClass().getSimpleName()+" Object Created Using Arg Constructor");
		this.b = b;
	}

	// @Autowired
	ClassB b;

	public ClassB getB() {
		return b;
	}
	// @Autowired
	public void setB(ClassB b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "ClassA [b=" + b + "]";
	}
	
	
}
