package Com.nit.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.nit.enginess.IEngine;
@Component
public class Truck implements Vechile {
	private IEngine engineType;
	private double capacity;
	
	
	public Truck() {
		super();
	}


	public Truck(IEngine engineType, double capacity) {
		super();
		this.engineType = engineType;
		this.capacity = capacity;
	}


	@Override
	public String getDescription() {
		return "This is "+this.getClass().getSimpleName()+" with "+engineType+" can load "+capacity+" tone";
		
	}

}
