 package com.nit.sbeans;

public class PayPal  implements Payment{
	private String email, password;
	 public PayPal(String email, String password) {
		  this.email= email;
		  this.password= password;
	 }

	@Override
	public void pay(int amount) {
		System.out.println("Paid Rs"+amount +"using payPal.");
		
	}

}
