package com.nit.sbeans;

import java.util.HashMap;
import java.util.Map;

public class VegBillingService implements   BillingService{

	private final Map<String, Double>prices= new HashMap<>();
public VegBillingService() {
		 prices.put("Idli", 30.0 );
		 prices.put("Dosa", 50.0);
		 
	}
	@Override
	public double getBill(String item) {
		
		return prices.getOrDefault(item, 0.0);
	}

}
