package edu.jspiders.implicitwiring.beans;

import org.springframework.stereotype.Component;

@Component("classc")
public class ClassC implements C{

	public ClassC() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
}
