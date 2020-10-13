package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;									
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>(); //Cada rueda tiene un diametro y marca distintos? 2 en 2?

	public Vehicle(String plate, String brand, String color, ArrayList<Wheel> wheels) throws Exception {
		
		if (plate.equals(""))
			throw new Exception();
		if (brand.equals(""))
			throw new Exception();
		if (color.equals(""))
			throw new Exception();
			
		this.plate = plate;
		this.brand = brand;
		this.color = color;
		this.wheels = wheels;
	}	
	
	public Vehicle(String plate, String brand, String color) throws Exception {
		
		if (plate.equals(""))
			throw new Exception();
		if (brand.equals(""))
			throw new Exception();
		if (color.equals(""))
			throw new Exception();
		
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}	
	
	/*public static String getPlateNumber () {
		
		return plate;
	}*/
	
	public abstract void addWheels();	
	
}