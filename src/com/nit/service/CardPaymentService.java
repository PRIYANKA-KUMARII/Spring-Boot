package com.nit.service;

import org.springframework.stereotype.Component;

@Component("cardPaymentService")
public class CardPaymentService implements PaymentService{

	@Override
	public void processPayment(double amount) {
		System.out.println(" Processing Card Payment Of Rs :"+ amount);
		
	}

}
