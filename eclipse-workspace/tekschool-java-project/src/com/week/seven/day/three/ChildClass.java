package com.week.seven.day.three;

public class ChildClass extends ParentClass{//creates inheritance
	public ChildClass(String name) {
		super(name);
	}
	
	public void printName() {
		System.out.println("It's " + super.name);/// super. : refers to parent class variable and methods
	}
}
