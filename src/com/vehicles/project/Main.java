//FASE 1+2+3 M6 13/10/2020

package com.vehicles.project;

import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Scanner entrada = new Scanner(System.in);
		String plate = "";
		String brand = "";
		String color = "";
		double diameter = 0;
		int carOrBike = 0;
				
		while (true) {		//Pregunto si quiere quiere crear coche o moto + control excepción (check que entrada sea 0 o 1)
							
			try	{
				
				System.out.println("Vols crear un cotxe o una moto? 1 = Cotxe / 0 = Moto ");
				carOrBike = entrada.nextInt();	
				//entrada.nextLine();
				carOrBike = MyException.wrongChoice (carOrBike);  //Método para revisar que número introducido sea 1 o 0;
				break;					
			}
			catch (InputMismatchException e) {
				System.err.println("Error! Torna-ho a provar siusplau (Introdueix 1 = Cotxe / 0 = Moto) ");
				entrada.nextLine();
				continue;
			}		
		}		
				
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Afegeix la matricula del teu vehicle: ");
		plate = entrada2.nextLine();
		plate = MyException.wrongPlate(plate);
		System.out.println("Afegeix la marca del teu vehicle: ");
		brand = entrada2.nextLine();
		System.out.println("Afegeix el color del teu vehicle: ");
		color = entrada2.nextLine ();
		
		if (carOrBike == 1) {
			
			Car car =  new Car (plate, brand, color);
			
			//Pedimos datos ruedas traseras y añadimos valores a ArrayList backWheels, pasando por método de control de datos (diámetro).
						
			while (true) {
				
				try	{
					System.out.println("Afegeix la marca de les 2 rodes posteriors del teu cotxe: ");
					brand = entrada2.nextLine();		
					System.out.println("Afegeix el diametre de les 2 rodes posteriors del teu cotxe: ");
					diameter = entrada2.nextDouble();
					diameter = MyException.wrongDiameter(diameter);
					break;
					}
				catch (InputMismatchException e) {
					System.err.println("No has introuduït un número! Torna-ho a provar siusplau");
					entrada2.nextLine();
					continue;
					}
			}		
			
			Wheel backWheel1 = new Wheel (brand, diameter);
			Wheel backWheel2 = new Wheel (brand, diameter);
			
			ArrayList<Wheel> backWheels = new ArrayList<Wheel>();
			
			backWheels.add(backWheel1);
			backWheels.add(backWheel2);
			
			//Pedimos datos ruedas delanteras y añadimos valores a ArrayList frontWheels, pasando por método de control de datos (diámetro).
						
			while (true) {
				
				Scanner entrada3 = new Scanner(System.in);
				
				try	{
					System.out.println("Afegeix la marca de les 2 rodes davanteres del teu cotxe: ");
					brand = entrada3.nextLine();	
					System.out.println("Afegeix el diametre de les 2 rodes davanteres del teu cotxe: ");
					diameter = entrada3.nextDouble();
					diameter = MyException.wrongDiameter(diameter);
					break;
					}
				catch (InputMismatchException e) {
					System.err.println("No has introuduït un número! Torna-ho a provar siusplau");
					entrada3.nextLine();
					continue;
					}
			}		
					
			Wheel frontWheel1 = new Wheel (brand, diameter);
			Wheel frontWheel2 = new Wheel (brand, diameter);
			
			ArrayList<Wheel> frontWheels = new ArrayList<Wheel>();
			
			frontWheels.add(frontWheel1);
			frontWheels.add(frontWheel2);
			
			//Añadimos todas las ruedas a Car:
			
			car.addWheels(frontWheels,backWheels);
						
			System.out.println("Has creat el teu cotxe amb matricula: " + car.plate + ", de marca: " + car.brand  + ", i color: " + car.color + ".");
			System.out.println("Amb rodes: " + car.toString());
				
		} else if (carOrBike == 0) {
			
			Bike bike =  new Bike (plate, brand, color);
			Scanner entrada4 = new Scanner(System.in);
			
			//Pedimos datos rueda trasera, pasando por método de control de datos (diámetro).
			
			while (true) {
				
				try	{
					System.out.println("Afegeix la marca de la roda posterior de la teva moto: ");
					brand = entrada4.nextLine();		
					System.out.println("Afegeix el diametre de la roda posterior de la teva moto: ");
					diameter = entrada4.nextDouble();
					diameter = MyException.wrongDiameter(diameter);
					break;
					}
				catch (InputMismatchException e) {
					System.err.println("No has introuduït un número! Torna-ho a provar siusplau");
					entrada4.nextLine();
					continue;
					}
			}		
			
			Wheel backWheel = new Wheel (brand, diameter);
						
			//Pedimos datos ruedas delanteras y añadimos valores a ArrayList frontWheels, pasando por método de control de datos (diámetro).
						
			while (true) {
				
				Scanner entrada5 = new Scanner(System.in);
				
				try	{
					System.out.println("Afegeix la marca de la roda davantera de la teva moto: ");
					brand = entrada5.nextLine();	
					System.out.println("Afegeix el diametre de la roda davantera de la teva moto: ");
					diameter = entrada5.nextDouble();
					diameter = MyException.wrongDiameter(diameter);
					break;
					}
				catch (InputMismatchException e) {
					System.err.println("No has introuduït un número! Torna-ho a provar siusplau");
					entrada5.nextLine();
					continue;
					}
			}		
					
			Wheel frontWheel = new Wheel (brand, diameter);
						
			//Añadimos todas las ruedas a bike:
			
			bike.addWheels(frontWheel,backWheel);
						
			System.out.println("Has creat la teva moto amb matricula: " + bike.plate + ", de marca: " + bike.brand  + ", i color: " + bike.color + ".");
			System.out.println("Amb rodes: " + bike.toString());
		}	
	}
}