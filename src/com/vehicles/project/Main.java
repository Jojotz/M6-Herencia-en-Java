//FASE 1 M6 07/10/2020 Joan Coll

package com.vehicles.project;

import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Scanner entrada = new Scanner(System.in);
		
		String plate = "";
		String brand = "";
		String color = "";
		double diameter = 0;
		
		while (true) {
			try	{
				System.out.println("Afegeix la matricula del teu cotxe: ");
				plate = entrada.nextLine();
				System.out.println("Afegeix la marca del teu cotxe: ");
				brand = entrada.nextLine();
				System.out.println("Afegeix el color del teu cotxe: ");
				color = entrada.nextLine ();
				break;
				}
			catch (InputMismatchException e) {
				System.err.println("No has introuduït un número! Torna-ho a provar siusplau");
				entrada.nextLine();
				continue;
				}
		}
		
		Car car =  new Car (plate, brand, color);
		
		//Pedimos datos ruedas traseras y añadimos valores a ArrayList backWheels
		
		System.out.println("Afegeix la marca de les 2 rodes posteriors del teu cotxe: ");
		brand = entrada.nextLine();		
		System.out.println("Afegeix el diametre de les 2 rodes posteriors del teu cotxe: ");
		diameter = entrada.nextDouble();
		
		Wheel backWheel1 = new Wheel (brand, diameter);
		Wheel backWheel2 = new Wheel (brand, diameter);
		
		ArrayList<Wheel> backWheels = new ArrayList<Wheel>();
		
		backWheels.add(backWheel1);
		backWheels.add(backWheel2);
		
		//Pedimos datos ruedas delanteras y añadimos valores a ArrayList frontWheels
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Afegeix la marca de les 2 rodes davanteres del teu cotxe: ");
		brand = entrada2.nextLine();		
		System.out.println("Afegeix el diametre de les 2 rodes posteriors del teu cotxe: ");
		diameter = entrada2.nextDouble();
		
		Wheel frontWheel1 = new Wheel (brand, diameter);
		Wheel frontWheel2 = new Wheel (brand, diameter);
		
		ArrayList<Wheel> frontWheels = new ArrayList<Wheel>();
		
		frontWheels.add(frontWheel1);
		frontWheels.add(frontWheel2);
		
		//Añadimos todas las ruedas a Car:
		
		car.addWheels(frontWheels,backWheels);
						
	}
}