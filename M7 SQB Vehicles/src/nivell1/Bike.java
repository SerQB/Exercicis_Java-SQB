package nivell1;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}
	
	public void addWheels(Wheel frontWheel, Wheel backWheel) throws Exception  {
		addFrontWheel(frontWheel);
		addBackWheel(backWheel);
	}
	
	
	private void addFrontWheel(Wheel frontWheel) {
		this.wheels.add(frontWheel);
		
	}

	private void addBackWheel(Wheel backWheel) {
		this.wheels.add(backWheel);
		
	}
	

}
