package com.qa.garage;

import java.util.List;

public class Honda extends Vehicles {
	
	boolean horn;
	boolean testPassed;
	
	


//constructors 
public Honda() {
	
}


public Honda(boolean horn, boolean testPassed, List<String> colours,
		List<String> make, int mileage, int noOfWheels) {
	super (colours, make, mileage, noOfWheels);
	this.horn = horn;
	this.testPassed = testPassed;
	
}


public boolean isHorn() {
	return horn;
}


public void setHorn(boolean horn) {
	this.horn = horn;
}


public boolean isTestPassed() {
	return testPassed;
}


public void setTestPassed(boolean testPassed) {
	this.testPassed = testPassed;
}







}