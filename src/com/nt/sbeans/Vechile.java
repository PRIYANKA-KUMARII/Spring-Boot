package com.nt.sbeans;

public class Vechile {
	private String  name;
	private double price;
	
	public Vechile(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vechile [name=" + name + ", price=" + price + "]";
	}
	public String getVechile() {
		return toString();
			
		 
	}
}


