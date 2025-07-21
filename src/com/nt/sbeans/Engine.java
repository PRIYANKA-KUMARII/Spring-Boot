package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	public void  start(String fuelType, int temp, int pressure) {
		if(isFuelValid(fuelType)&& checkTemp(temp)&& typePressure(pressure)) {
			System.out.println("Car started successfully! Engine started!");
		}else {
			 System.out.println("Engine failed to start!");
		}
	}
	public boolean isFuelValid(String fuelType) {
		 return "petrol".equalsIgnoreCase(fuelType);
		 			}
	public boolean checkTemp(int temp) {
		 return temp<=30;
	}
	public boolean typePressure(int pressure) {
		 return pressure>=35 && pressure <=40;
	}

}
