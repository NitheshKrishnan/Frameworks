package edu.jspiders.explicitbeanwiring.bean;

public class ClassA {

	public ClassA() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	private ClassB b;

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
