package edu.jspiders.setterinjection.beans;

import java.util.Map;

public class ClassC {

	public ClassC() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	private Map<Integer, Character> map;

	public Map<Integer, Character> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Character> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "ClassC [map=" + map + "]";
	}
}
