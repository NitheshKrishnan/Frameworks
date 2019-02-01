package edu.jspiders.implicitbeanwiring.bean;

public class Harddisk {

	private String brand;
	private double capacity;
	private double price;
	
	public Harddisk() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Harddisk [brand=" + brand + ", capacity=" + capacity + ", price=" + price + "]";
	}
}
