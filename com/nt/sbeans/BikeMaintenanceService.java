package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bikeService")
public class BikeMaintenanceService implements MaintenanceService {

	@Override
	public void performService() {
		System.out.println("Performing car maintenance: oil change, tire rotation, brake inspection");
		
	}

}
