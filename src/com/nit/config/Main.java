package com.nit.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sbeans.FoodOrderApp;

public class Main {
	public static void main (String [] args) {
		 AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		 FoodOrderApp vegApp = ctx.getBean("foodOrderAppVeg", FoodOrderApp.class);
	        vegApp.orderFood("Idli");
	        vegApp.orderFood("Dosa");
	        vegApp.orderFood("Chicken Biryani");

	       
	        FoodOrderApp nonVegApp = ctx.getBean("foodOrderAppNonVeg", FoodOrderApp.class);
	        nonVegApp.orderFood("Chicken Biryani");
	        nonVegApp.orderFood("Mutton Curry");
	        nonVegApp.orderFood("Dosa");

	        ctx.close();
	    }
	}
