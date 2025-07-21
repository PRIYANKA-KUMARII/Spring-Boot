package com.nit.sbeans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("amazonService")
@Primary
public class AmazonService implements ShoppingService {
private final Map<String, Double>cart= new HashMap<>();


	@Override
	public void addItem(String item, double price) {
		cart.put(item,  price);
		
	}

	@Override
	public void viewCart() {
		cart.forEach((k,v)->System.out.println(k+""+v));
	}

	@Override
	public void checkout() {
	
	double sum = cart.values().stream().mapToDouble(Double::doubleValue).sum();
	double discount=sum*10/100;
	System.out.println((discount-sum)+" indicating fast delivery (e.g., within 2 days).");
		
	}
}