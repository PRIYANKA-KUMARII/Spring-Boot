package com.nit.sbeans;

import java.util.HashMap;
import java.util.Map;

public class NonVegBillingService  implements BillingService{
	private final Map<String, Double> nonVegPrices= new HashMap<>();
	
public NonVegBillingService() {
	 nonVegPrices.put("Chicken Biryani", 150.0);
	 nonVegPrices.put("Mutton Curry", 200.0);
}
	@Override
	public double getBill(String item) {
		
		return nonVegPrices.getOrDefault(item, 0.0);
	}

}
