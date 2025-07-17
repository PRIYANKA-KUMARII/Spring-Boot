package com.nit.sbeans;

public class ShoppingCart {
	private Payment payment;
	public void setPayment(Payment payment) {
		this.payment =payment;
	}
	public void checkout(int amount) {
		 payment.pay(amount);
	}

}
