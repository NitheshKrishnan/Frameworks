package edu.jspiders.implicitbeanwiring.bean;

public class Processor {

	private String brand;
	private String version;
	private double price;
	
	public Processor() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", version=" + version + ", price=" + price + "]";
	}
	
}
