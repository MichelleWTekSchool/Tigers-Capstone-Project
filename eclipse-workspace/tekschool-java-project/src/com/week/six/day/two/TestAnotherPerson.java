package com.week.six.day.two;

public class TestAnotherPerson {

	public static void main(String[] args) {
		
		
		//create a person object then provide first name nd last name
		//with using fullName
		//then print the fullName in all lower case;
		
		//method is a block of code that calls values
		//new person is a object
		
		Person personObject = new Person();
		
		personObject.firstName = "John";
		personObject.lastName  = "Smith";
		
		String fullName = personObject.getFullName();
		System.out.println(fullName.toLowerCase());
	}
}
