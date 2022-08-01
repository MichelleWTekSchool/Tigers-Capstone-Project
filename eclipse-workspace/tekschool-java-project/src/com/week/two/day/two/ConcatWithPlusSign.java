package com.week.two.day.two;

public class ConcatWithPlusSign {
	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Smith";
		String middleName = "Lee";
		char middle = 'L';
		
		String fullName = firstName + " " + lastName;
		
		System.out.println(fullName);
	
	
	String newFormatFullName = lastName + "," + firstName + " " + middleName;
	System.out.println(newFormatFullName);
	
	String newFullName = lastName + "," + firstName + " " + middle;
	System.out.println(newFullName);
	}

}
