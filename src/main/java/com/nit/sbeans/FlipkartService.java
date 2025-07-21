package com.nit.sbeans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("flipkart")
public class FlipkartService implements ShoppingService
{
	private final Map<String, Double>cart= new HashMap<>();

	@Override
	public void addItem(String item, double price) {
		cart.put(item, price);		
	}

	@Override
	public void viewCart() {
		cart.forEach((k,v)->System.out.println(k+""+v));
		
	}

	@Override
	public void checkout() {
		double sum= cart.values().stream().mapToDouble(Double::doubleValue).sum();
		double discount= sum*5/100;
		System.out.println((discount-sum)+"Delivery:Standard delivery(3-5 days");
		
	}

	
	

}
