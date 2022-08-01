package com.week.three.day.two;

public class RecapLogicalOperators {

	public static void main(String[] args) {
		
		boolean condition1 = true;
		boolean condition2 = false;
		
		boolean result = condition1 && condition2; // Equal condition
		System.out.println(result);
		
		boolean result2 = condition1 || condition2; // Or condition
		System.out.println(result2);
		
		int age = 35; 
		//age should be more than equal 16
		//age should be less than 65
		// to be able to drive
		
		boolean eligibleAge = age <= 65 && age >= 16;
		System.out.println("I am old enought to drive: " + eligibleAge);
	
			

	}
	
}
