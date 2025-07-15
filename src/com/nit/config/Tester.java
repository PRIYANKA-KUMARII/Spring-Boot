package com.nit.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.service.PaymentProcessor;


public class Tester {
	public static void main(String [] args) {
		try{
			 AnnotationConfigApplicationContext ctx= new  AnnotationConfigApplicationContext(AppConfig.class);


		PaymentProcessor processor= ctx.getBean(PaymentProcessor.class);
            processor.pay(300);
		}catch(Exception e) {
			 e.printStackTrace();
		}
	}
}
