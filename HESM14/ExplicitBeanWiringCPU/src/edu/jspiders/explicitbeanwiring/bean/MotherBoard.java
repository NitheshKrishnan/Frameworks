package edu.jspiders.explicitbeanwiring.bean;

public class MotherBoard {

	private String brand;
	private String version;
	private double price;
	
	public MotherBoard() {
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
		return "MotherBoard [brand=" + brand + ", version=" + version + ", price=" + price + "]";
	}
	
}
