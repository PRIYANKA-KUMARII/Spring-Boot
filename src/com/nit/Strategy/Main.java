package com.nit.Strategy;

import com.nit.sbeans.CreditCardStrategy;
import com.nit.sbeans.Payment;
import com.nit.sbeans.ShoppingCart;

public class Main {

	public static void main(String[] args) {
		 ShoppingCart cart = new ShoppingCart();
	        cart.setPayment(new CreditCardStrategy("Alice", "1234", "999", "12/25"));
	        cart.checkout(500);
//	        cart.setPaymentStrategy(new PayPalStrategy("bob@example.com", "s3cr3t"));
	        cart.checkout(750);
	    }
	}