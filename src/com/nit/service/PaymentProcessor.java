package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class PaymentProcessor{
	
 private PaymentService paymentService;
 @Autowired
 public void paymentProcessor(@Qualifier("cardPaymentService") PaymentService paymentService){
	 this.paymentService=paymentService;
 }
 public void pay(double amount) {
	 paymentService.processPayment(amount);
	 
 }
}