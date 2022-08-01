package com.week.two.day.three;

public class StringConcat {
	public static void main(String[] args) {
		//string concat method is used to append a string to the end of another string
		String firstName = "Michelle";
		String lastName = "Williams";
		
		//using + sign
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		
		//use concat method
		String fullName1 = firstName.concat(lastName);
		System.out.println(fullName1);
		
		String text = firstName.concat(" ");
		String fullNameWithSpace = text.concat(lastName);
		System.out.println(fullNameWithSpace);
		
		
	}

}
