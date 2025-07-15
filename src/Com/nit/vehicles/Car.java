package Com.nit.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.nit.enginess.IEngine;
@Component
public class Car implements Vechile {
	private IEngine engineType;
	private int doors;

	public Car(IEngine engineType, int doors) {
		super();
		this.engineType = engineType;
		this.doors = doors;
	}
	
	public Car() {
		super();
	}
	@Override
	public String getDescription() {

		return "This is Car with "+engineType.getClass().getSimpleName()+" having "+doors+" doors";
	}

}
