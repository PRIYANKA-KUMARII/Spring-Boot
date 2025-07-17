package com.nit.sbeans;

public class CreditCardStrategy implements Payment {
private String cardNumber, name, cvv, expiry;
public CreditCardStrategy(String name, String cardNumber, String cvv,String expiry ) {
	this.cardNumber= cardNumber;
	 this.name= name;
	 this.cvv= cvv;
	 this.expiry= expiry;
}
	@Override
	public void pay(int amount) {
		System.out.println("Paid Rs"+amount +"using Credit Card.");
		
	}

}
