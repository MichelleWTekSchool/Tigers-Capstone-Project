package com.week.seven.day.three;

public class ParentClass {
	public String name;
	
	public ParentClass() {//no value in parameter
		System.out.println("Parent class constrcutor without parameter");
	}
	
	public ParentClass(String name) {//has a parameter
		this();
		this.name = name; //provides value to parameter
	}
}
