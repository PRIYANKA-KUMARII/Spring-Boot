package Com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Com.nit.config.AppConfig;
import Com.nit.factory.ConcreteVehicleFactory;
import Com.nit.factory.VehicleFactory;
import Com.nit.factory.VehicleService;
import Com.nit.vehicles.Vechile;

public class MainClass {
public static void main(String[] args) {
	  AnnotationConfigApplicationContext apx = new AnnotationConfigApplicationContext(AppConfig.class);
	  ConcreteVehicleFactory b = apx.getBean(ConcreteVehicleFactory.class);
	  Vechile vehicle = b.createVehicle("car", "diesel");
	  	System.out.println(vehicle.getDescription());
}
}
