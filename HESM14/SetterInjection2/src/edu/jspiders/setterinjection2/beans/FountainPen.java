package edu.jspiders.setterinjection2.beans;

public class FountainPen implements Pen{

	private String brand,type;
	private int price;
	
	public FountainPen() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	@Override
	public void getPenBrand() {
		
		System.out.println("Brand = "+brand);
	}

	@Override
	public void getPenType() {
		
		System.out.println("Type = "+type);
	}

	@Override
	public void getPenPrice() {
		
		System.out.println("Price = "+price);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FountainPen [brand=" + brand + ", type=" + type + ", price=" + price + "]";
	}
	
}
