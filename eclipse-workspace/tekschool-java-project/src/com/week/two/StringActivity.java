package com.week.two;

public class StringActivity {
	
	public static void main(String[] args) {
		//Activity
		//Find first name and last name
		
		String fullName = "Williams, Michelle";
		
		int indexOfSpace = fullName.indexOf(" ");
		int indexOfComma = fullName.indexOf(",");
		
		//looking for firstName
		String lastName = fullName.substring(0 , indexOfSpace); //To index
		String firstName = fullName.substring(indexOfComma); //with help of space index with substring subtracted
		
		System.out.println("First Name is ::: " + firstName);
		System.out.println("Last Name is ::: " + lastName);
		
	}
	}