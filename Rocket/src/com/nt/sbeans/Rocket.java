package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component
public class Rocket {
	
	public void ignite(String fuelType) {
		if(isFuel(fuelType)) {
			System.out.println("Rocket ignited!!");
		}else {
			 System.out.println("Rocket not started!!");
		}
	}
	public boolean isFuel(String fuelType) {
		 return "full".equalsIgnoreCase(fuelType);
			
		}
		
	}

