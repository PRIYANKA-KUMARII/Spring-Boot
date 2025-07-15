package com.nit.service;

import org.springframework.stereotype.Component;

@Component("upiPaymentService")
public class UPIPaymentService implements PaymentService{

	@Override
	public void processPayment(double amount) {
		System.out.println("Payment UPI payment of Rs:"+amount);
		
	}
	
}


