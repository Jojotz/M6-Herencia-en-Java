package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
	
	private static int wheelsTot = 4;  //coche = matricula, marca, color, + 4 ruedas?

	public Car(String plate, String brand, String color, ArrayList<Wheel> wheels) throws Exception {
		super(plate, brand, color, wheels);
	}

	public Car(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
		
	}

	public void addWheels(ArrayList<Wheel> frontWheels, ArrayList<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
		// se llama a método addTwoWheels con ambos arraylists de ruedas, front y back wheels.
	}

	public void addTwoWheels(ArrayList<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		/*if (!(rightWheel.equals(leftWheel)))
			throw new Exception();*/

		this.wheels.add(leftWheel); // List de 4 ruedas ?  con su marca y diametro?
		this.wheels.add(rightWheel);
	}

	@Override
	public void addWheels() {
			
	}

}
