package com.week.nine.day.two;

public abstract class Personal {
	
	String fullName;
	
	public abstract void responsibility();
	
	public void printFullName() {
		System.out.println("Fullname is " + fullName);
	}
}
