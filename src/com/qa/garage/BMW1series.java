package com.qa.garage;

import java.util.List;

public class BMW1series extends Vehicles {
	
	boolean radio;
	int noOfDoors;
	
	//Method
	public void topSpeed() {
		System.out.println("Top speed is 220");
		
	}
	
	//Constructor
	
	public BMW1series() {
		
	}
	

	public BMW1series(boolean radio, int noOfDoors, List<String> colours,
	List<String> make, int mileage, int noOfWheels) {
		super(colours, make, mileage, noOfWheels);
		// make sure bmw1 series attributes are being added below
		this.radio = radio;
		this.noOfDoors = noOfDoors;
		
	}
	
	//Getters and setters 

	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	
}
