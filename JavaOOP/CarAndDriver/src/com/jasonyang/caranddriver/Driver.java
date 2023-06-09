package com.jasonyang.caranddriver;

public class Driver extends Car{
	
	//METHODS
	// Driving should decrease gas by 1
	public void drive() {
		gas -= 1;
		System.out.println("You drive the car.");
		displayGasTank();
		System.out.println("\n");
	}
	
	// Using boosters should decrease gas by 3
	public void nos() {
		gas -= 3;
		System.out.println("You see Ja Rule and decide hit the nos button.");
		System.out.println("Ja Rule: Monicaaaaaaa!!!");
		displayGasTank();
		System.out.println("\n");
	}
	
	// Refueling should increase gas by 2
	public void pumpE85() {
		gas += 2;
		System.out.println("You see a gas station that has corn at the pump so you decide to pump while you can.");
		displayGasTank();
	}
}
