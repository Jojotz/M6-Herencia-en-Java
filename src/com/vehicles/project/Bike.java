package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public class Bike extends Vehicle {
	
	private static int wheelsTot = 2;
		
	public Bike(String plate, String brand, String color, ArrayList<Wheel> wheels) throws Exception {
		super(plate, brand, color, wheels);
	}
	
	/*@Override
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addOneWheel(frontWheels);
		addOneWheel(backWheels);
	}*/
	
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		
	}

	@Override
	public void addWheels() {
		// TODO Auto-generated method stub
		
	}

}