package edu.jspiders.implicitbeanwiringannotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ram {

	@Value("Kingston")
	private String brand;
	@Value("8")
	private double capacity;
	@Value("4000")
	private double price;
	
	public Ram() {
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
		return "Ram [brand=" + brand + ", capacity=" + capacity + ", price=" + price + "]";
	}
	
}
