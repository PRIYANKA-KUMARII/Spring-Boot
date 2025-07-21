package com.nit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.sbeans.ShoppingService;

public class Main {
	@Autowired
	@Qualifier("amazonService")
	public static void main (String [] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		ShoppingService shoppingService= ctx.getBean(ShoppingService.class);
		
		shoppingService.addItem("Laptop", 50000);
		shoppingService.viewCart();
		shoppingService.checkout();
		ctx.close();
	}

}
