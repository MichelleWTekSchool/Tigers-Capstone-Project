package com.week.two;

public class StringReview {
public static void main(String[] args) {
	
	//Separate first name and last name
	//this code works for this format only
	
	String fullName = "Michelle Williams";
	
	int indexOfSpace = fullName.indexOf(" ");
	
	//looking for firstName
	String firstName = fullName.substring(0 , indexOfSpace); //TO index
	String lastName = fullName.substring(indexOfSpace); //with help of space index with substring subtracted
	
	System.out.println("First Name is ::: " + firstName);
	System.out.println("Last Name is ::: " + lastName);
	
}
}
