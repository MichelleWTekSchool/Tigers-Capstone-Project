package com.week.two.day.two;

public class StringLengthExample {
	
	public static void main(String[] args) {
	
	String firstName = "Michelle";
	String lastName = "Williams";
	
	int firstNameLength = firstName.length();
	System.out.println("Length of first name ::: " + firstNameLength);
	
	int lastNameLength = lastName.length();
	System.out.println("Length of last name ::: " + lastNameLength);
	
	String fullName = firstName + " " + lastName;
	int fullNameLength = fullName.length();
	System.out.println("Length of fullname ::: " + fullNameLength);
	
	}

}
