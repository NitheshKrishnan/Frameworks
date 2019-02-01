package edu.jspiders.constructorinjection.beans;

public class ClassA {

	private int x;
	private double y;
	private String s;
	
	public ClassA(int x, double y, String s) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object"
				+ "Created ClassA(int,double,String)");
		
		this.x = x;
		this.y = y;
		this.s = s;
	}
	
	public ClassA(double y, int x,  String s) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object"
				+ "Created ClassA(double,int,String)");
		
		this.x = x;
		this.y = y;
		this.s = s;
	}
	
	public ClassA(String s,int x, double y) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object"
				+ "Created ClassA(String,int,double)");
		
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
		return "ClassA [x=" + x + ", y=" + y + ", s=" + s + "]";
	}
}
