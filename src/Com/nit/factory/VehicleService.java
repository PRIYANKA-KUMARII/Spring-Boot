package Com.nit.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.nit.vehicles.Vechile;
@Component
public class VehicleService {

	@Autowired
	VehicleFactory vehicleFactory;
	
	
	void createVehicle(String type, String engineType)
	{
		vehicleFactory.createVehicle(type, engineType);
	}
}
