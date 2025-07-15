package Com.nit.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Com.nit.enginess.IEngine;

@Component
public class MotorCycle implements Vechile{
	private IEngine engineType;
	private boolean carSide;

	
	
	
	public MotorCycle(IEngine engineType, boolean carSide) {
		super();
		this.engineType = engineType;
		this.carSide = carSide;
	}


	public MotorCycle() {
		super();
	}


	@Override
	public String getDescription() {
		return "A "+this.getClass().getSimpleName()+" having "+engineType+" it has car side"+(carSide?"Yes":"No");
	}

}
