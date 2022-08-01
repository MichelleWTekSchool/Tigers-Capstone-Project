package com.week.six.day.two;

public class Person { //class name
	String firstName;
	String lastName;
	
	//create a method for full name
	//concate
	
	//constructor is used to initialize an object of this class
	//similar to method but doesn't return type
	//and it is the name of the class name
	//Constructor contains a block of codes*
	
	
	
	public Person() { //constructor is same as class name
		System.out.println("This is a construction");// *this is a block of code to start coding in a constructor
		
	}
	
	public String getFullName() {
		
	//String fullName = firstName + " " + lastName;
	//return firstName + " " + lastName; is used in place of the above 
		
		String fullName = firstName + " " + lastName;
		return fullName;
		
	}
	
}
