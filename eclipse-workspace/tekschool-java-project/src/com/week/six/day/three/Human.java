package com.week.six.day.three;

public class Human {
	String firstName;
	String lastName;
	
	//Required to pass values for first and last name

	public Human(String firstNameParameter, String lastNameParameter) {
	 firstName = firstNameParameter;
	 lastName = lastNameParameter;
	 
	}
	public String getFullName() {
		return firstName + " " + lastName;
	}
}
