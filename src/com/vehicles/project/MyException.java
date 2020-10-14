package com.vehicles.project;

import java.util.*;

class MyException {
	
	public static String wrongPlate(String plate) {
		
		String pattern = "^[0-9]{4}[A-Za-z]{2,3}";		
		Scanner entrada = new Scanner(System.in);
		
		while (!(plate.matches(pattern))) {
			
			System.out.println("Matrícula incorrecta, recorda: ha de contenir 4 digits + 2 o 3 lletres.");
			plate = entrada.nextLine();	
			
		}
		
		return plate;
	}
	
	public static double wrongDiameter(double diameter) {
		
		Scanner entrada3 = new Scanner(System.in);
		
		while (diameter <= 0.4 || diameter >= 4) {
			
			System.out.println("Diametre incorrecte, aquest ha de ser superior a 0.4 i inferior a 4.");
			diameter = entrada3.nextDouble();	
			
		}
		
		return diameter;
	}
	
	public static int wrongChoice(int carOrBike) {
		
		Scanner entrada3 = new Scanner(System.in);
		
		while (carOrBike > 1 || carOrBike < 0) {
			System.out.println("Número introduït incorrecte! Recorda: 1 = Cotxe / 0 = Moto");
			carOrBike = entrada3.nextInt();	
			//entrada3.nextLine();
		
		}
		
		return carOrBike;
	}
}