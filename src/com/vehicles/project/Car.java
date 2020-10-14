package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
	
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

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}
	
	public String toString() { 
        
        String bwheelstoString = "Posteriors; marca: " + wheels.get(2).getBrand() + ", i diámetre de: " + wheels.get(2).getDiameter() + " dm.\n";
        String fwheelstoString = "Davanteres; marca: " + wheels.get(0).getBrand() + ", i diámetre de: " + wheels.get(0).getDiameter() + " dm.\n";
       
        return bwheelstoString + fwheelstoString; 
    } 

	@Override
	public void addWheels() {
			
	}
}