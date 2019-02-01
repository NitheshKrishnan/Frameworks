package edu.jspiders.constructorinjection.beans;

public class ClassB {

	private int x;
	private double y;
	private String s;
	
	public ClassB(int x, double y, String s) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object"
				+ "Created Using Arguement Constructor");
		
		this.x = x;
		this.y = y;
		this.s = s;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "ClassB [x=" + x + ", y=" + y + ", s=" + s + "]";
	}
	
	
}
