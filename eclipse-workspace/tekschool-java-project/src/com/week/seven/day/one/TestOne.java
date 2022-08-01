package com.week.seven.day.one;

public class TestOne extends BaseClass {
	//Tests
public void testingApplicationRunning() {
	// I need to setup first using testSetup
	//Gain access to base by extending to base class
	
	testSetup();//this testSetup came from base class
	//we called this method to have access to all properties and methods as inheritance
	
	// Do click leads from utilities
	doClick();
	
	//sendValue
	sendValue();
	
}
}
