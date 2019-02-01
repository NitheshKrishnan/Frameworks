package edu.jspiders.setterinjection.beans;

import java.util.List;

public class ClassA {

	public ClassA() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	private List<Character> list;

	public List<Character> getList() {
		return list;
	}

	public void setList(List<Character> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ClassA [list=" + list + "]";
	}
	
	
}
