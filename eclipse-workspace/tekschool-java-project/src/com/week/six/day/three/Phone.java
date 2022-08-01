package com.week.six.day.three;

public class Phone {
	//Encapsulate and provide properties
	
	//private can only be used in this class
	private String brand;
	private String color;
	
	//DATA TYPES
	//Getters: used to get value
	//Setters: used to set values
	
	//Setters
	public void setBrand(String brandParam) {
		brand = brandParam;
	}
	public void setColor(String colorParam) {
		color = colorParam;	
	}
	//Getters:Dont take any parameters
	//Returns same data type as the parameter
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	}
