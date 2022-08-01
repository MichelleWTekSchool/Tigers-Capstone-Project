package com.week.two;

public class StringConcatination {
	public static void main(String[] args) {
	
		String firstName = "Michelle";
		
		String lastName = "Williams";
		
		String fullName = firstName + " " + lastName;
		
		//System.out.println(firstName);
		//System.out.println(lastName);
		//prints on two lines
		
		//appending two strings or characters to a string
		System.out.println(firstName + lastName);

		//with spaces between words - not clean code
		System.out.println(firstName + " " + lastName);
		
		//clean code with full name
		System.out.println(fullName);
		
		
		
		
}
}