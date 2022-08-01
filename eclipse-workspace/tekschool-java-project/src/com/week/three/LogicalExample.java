package com.week.three;

public class LogicalExample {
	public static void main(String[] args) {
		int age = 35;
		
		//two conditions to check
		//more than 16 AND less than 65 to drive
		
		boolean isEligible = age > 16 && age < 65;
		System.out.println(isEligible);
	}

}
