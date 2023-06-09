package com.jasonyang.caranddriver;

public class Car {
	public int gas = 10;
	
	//CONSTRUCTOR
	public Car() {
		this.gas = gas;
	}
	
	//METHODS
	public void displayGasTank() {
		System.out.println("Gas gauge:" + gas + "/10");
	}
	
}
