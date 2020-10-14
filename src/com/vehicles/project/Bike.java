package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public class Bike extends Vehicle {
			
	public Bike(String plate, String brand, String color, ArrayList<Wheel> wheels) throws Exception {
		super(plate, brand, color, wheels);
	}
	
	public Bike (String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
		
	}
		
	public void addWheels(Wheel frontWheel, Wheel backWheel) throws Exception {
		addOneWheel(frontWheel);
		addOneWheel(backWheel);
	}
	
	public void addOneWheel(Wheel wheels) throws Exception {
		
		Wheel wheel = wheels;
		
		this.wheels.add(wheel);
	}
	
	public String toString() { 
        
        String bwheeltoString = "Posterior; marca: " + wheels.get(1).getBrand() + ", i diámetre de: " + wheels.get(1).getDiameter() + " dm.\n";
        String fwheeltoString = "Davantera; marca: " + wheels.get(0).getBrand() + ", i diámetre de: " + wheels.get(0).getDiameter() + " dm.\n";
       
        return bwheeltoString + fwheeltoString; 
    } 

	@Override
	public void addWheels() {
				
	}
}