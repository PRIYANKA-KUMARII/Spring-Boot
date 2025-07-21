package com.nit.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sbeans.ProfitLoss;

public class Main {

	public static void main (String [] args) {
	try (AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class)){
	ProfitLoss profitLoss= ctx.getBean(ProfitLoss.class);
	profitLoss.calculateProfit();
	}
	}
}
