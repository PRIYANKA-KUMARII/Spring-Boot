package com.nt.sbeans;

public abstract class Cake {
	private  String flavour;
	private float quantity;
	private  float price;
	private String shape_of_Cake;
	public Cake() {
		 this.flavour= "Vallina";
		 this.quantity=1;
		 this.price= 300;
		 this.shape_of_Cake= "Round";
		 
	}
	public Cake(String flavour, float quantity, String shapeOfCake) {
		this.flavour=flavour;
		this.quantity= quantity;
		this.shape_of_Cake=shapeOfCake;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setShape_of_Cake(String shape_of_Cake) {
		this.shape_of_Cake = shape_of_Cake;
	}
	@Override
	public String toString() {
		return "Cake [Flavour=" + flavour + ", quantity=" + quantity + ", price=" + price + ", shape_of_Cake="
				+ shape_of_Cake + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String getOrderCake() {
		return toString();
			
		}
		
	}
//		 float total= price*quantity;
//		 if(messageOnCake !=null && !messageOnCake.isBlank()) {
//			 return String.format("OrderCake[message_on_cake=%s, order=%s]",messageOnCake, base);
//			 
//		 }
//		return ;
//		 
//	}
	
	

//}
