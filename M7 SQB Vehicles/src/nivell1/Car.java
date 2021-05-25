package nivell1;

import java.util.List;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}
	
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception  {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception(" No pot tenir m�s de 2 rodes davanteres o posteriors");

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception(" La roda esquerra i dreta han de ser iguals");
		
		//if ((rightWheel.getDiameter() != (leftWheel.getDiameter())))
			//throw new Exception(" La roda esquerra i dreta han de ser iguals");

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

	
}
