package com.week.two.day.three;

public class StringClassActivity {

	public static void main(String[] args) {
		//substring first and last name names
		
		String fullName = "Michelle Williams";
		String firstName = fullName.substring(0,8);
		String lastName = fullName.substring(9);
		
		System.out.println("Furst name is " + firstName);
		System.out.println("Last name is " + lastName);
		
		
	}
}
