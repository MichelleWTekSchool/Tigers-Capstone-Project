package com.week.two.day.three;

public class StringRecap {
	
	public static void main(String[] args) {
		String greeting = "Welcome to Tekschool!!";
		
		//Find length of string
		int lengthOfGreeting = greeting.length();		
		System.out.println("Length is " + lengthOfGreeting);
		
		//make uppercase
		String upperCase = greeting.toUpperCase();
		System.out.println(upperCase);
		
		//make all lowercase
		String lowerCase = greeting.toLowerCase();
		System.out.println(lowerCase);
		
		//find index of characters
		int indexOfL= greeting.indexOf('l');
		System.out.println("Index of letter l is " + indexOfL);
		
		//find character of specific index
		char indexOfCharacter = greeting.charAt(6);
		System.out.println(indexOfCharacter);
		
		
	}

}
