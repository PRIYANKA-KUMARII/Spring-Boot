package Com.nit.factory;

import org.springframework.stereotype.Component;

import Com.nit.enginess.DieselEngine;
import Com.nit.enginess.ElectricEngine;
import Com.nit.enginess.IEngine;
import Com.nit.vehicles.Car;
import Com.nit.vehicles.MotorCycle;
import Com.nit.vehicles.Truck;
import Com.nit.vehicles.Vechile;
@Component
public class ConcreteVehicleFactory implements VehicleFactory {

	
	public ConcreteVehicleFactory() {
		super();
	}

	@Override
	public Vechile createVehicle(String type, String engineType) {
		Vechile vh=null;
		IEngine en=engineType.equalsIgnoreCase("Diesel")?new DieselEngine():new ElectricEngine();
		
		if(type.equalsIgnoreCase("car"))
		{
			vh=new Car(en, 4);
		}
		else if(type.equalsIgnoreCase("motor"))
		{
			vh=new MotorCycle(en, true);
		}
		else if(type.equalsIgnoreCase("truck")) {
			vh=new Truck(en, 200);
		}
		
		return vh;
	}

	
	
}
