package com.week.two.day.two;

public class WaysToCreateString {
	public static void main(String[] args) {
		//ways to create string variable
		
		//1. string literal
		
		String name = "michelle";
		String text = "hello world!";
		String greeting = "Good morning Vietnam!";
		
		System.out.println(greeting);
		
		//2. using new keyword
		//reference
		String city = new String();
				city = "Austin";
				System.out.println(city);
		
		//3. using new keyword and pass value in parenthesis
		String country = new String("United States of America");
		System.out.println(country);
		
		float videO= 1.16f;
		System.out.println("Start video at " + videO);
		
				
	
	}

}
