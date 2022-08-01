package com.week.nine.day.one;

public class Car extends Object {
	private String make;
	private String getMake() {
		return make;
		
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	@Override
	public String toString() {
		return "Car Make: " + make;
	}

}
