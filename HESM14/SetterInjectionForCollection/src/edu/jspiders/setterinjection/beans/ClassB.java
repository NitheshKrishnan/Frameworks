package edu.jspiders.setterinjection.beans;

import java.util.Set;

public class ClassB {

	public ClassB() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	private Set<Double> set;

	public Set<Double> getSet() {
		return set;
	}

	public void setSet(Set<Double> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "ClassB [set=" + set + "]";
	}
	
	
}
