package edu.jspiders.implicitbeanwiring.beans;

public class ClassA {

	
	public ClassA() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	ClassB b;
	
	public ClassA(ClassB b) {
		System.out.println(this.getClass().getSimpleName()+" Object Created Using Arg-Constructor");
		this.b = b;
	}

	public ClassB getB() {
		return b;
	}

	public void setB(ClassB b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "ClassA [b=" + b + "]";
	}
	
	
}
