package edu.jspiders.implicitwiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
	
	public ClassA() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	@Autowired
	@Qualifier("classc")
	C c;

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "ClassA [c=" + c + "]";
	}
	
}
