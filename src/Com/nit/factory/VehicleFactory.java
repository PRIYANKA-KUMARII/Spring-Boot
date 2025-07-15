package Com.nit.factory;

import org.springframework.stereotype.Component;

import Com.nit.vehicles.Vechile;
@Component
public interface VehicleFactory {
	 Vechile createVehicle(String type, String engineType);
}
