package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class VehicleWorkshop {
	private MaintenanceService maintenanceService;
	@Autowired
	public void  maintenanceService(@Qualifier("carService")MaintenanceService maintenanceService) {
		this.maintenanceService =maintenanceService;
	}
	public void display() {
		maintenanceService.performService();
		
	}
	
}
