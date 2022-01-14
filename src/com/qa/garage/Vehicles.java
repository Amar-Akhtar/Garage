package com.qa.garage;

import java.util.List;

public class Vehicles {
	
	//Using Vehicle as a base class, create three derived classes (Car, Motorbike, etc.). 
	//Each derived class should have its own attributes in addition to the normal Vehicle attributes.
	
	//Attributes
private List<String> colours;
private List<String> make;
private int mileage;
private int noOfWheels;


//Methods

public void makeNoise() {
	System.out.println("Wroom");
}
	
public void drive() {
	System.out.println("vroom vroom");

	
}
//Constructors 
public Vehicles() {
	
}
public Vehicles(List<String> colours, List<String> make, 
		int mileage, int noOfWheels) {
	this.colours = colours;
	this.make = make;
	this.mileage = mileage;
	this.noOfWheels = noOfWheels;
	
}
@Override
public String toString() {
	return "Vehicles [colours=" + colours + ", make=" + make + ", mileage=" + mileage + ", noOfWheels=" + noOfWheels
			+ "]";
}




//Getter and setters here 

public int getmileage() {
	return this.mileage;
}

public void setmileage(int mileage) {
	this.mileage = mileage;
}

public List<String> getColours() {
	return colours;
}

public void setColours(List<String> colours) {
	this.colours = colours;
}

public List<String> getMake() {
	return make;
}

public void setMake(List<String> make) {
	this.make = make;
}

public int getNoOfWheels() {
	return noOfWheels;
}

public void setNoOfWheels(int noOfWheels) {
	this.noOfWheels = noOfWheels;
}


	
	//Using a List<> implementation, store all your Vehicles in a Garage class.

	//Create a method in Garage that iterates through each Vehicle, calculating a bill for each type of Vehicle in a different way, depending on the type of Vehicle it is (this does not need to be complex).

	//Garage should have methods that add a Vehicle, remove a Vehicle by its ID or its type, fix a Vehicle (which calculates the bill) and to empty the Garage.

	//Garage should have a method to remove multiple Vehicles by their type.
	

}
