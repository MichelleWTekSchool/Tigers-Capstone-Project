package com.week.three;

public class CastingInJava {
	
	public static void main(String[] args) {
		//casting is a data type of conversion
		//implicit casting
		//byte > short > int > long float > double
		short numberA = 200;
		short numberB = 300;
		
		int result = numberA + numberB;
		
		System.out.println(result);
		
		byte age = 34;
		short ageNumber = age;
		
		System.out.println(ageNumber);
		
		float numberFloat = 22.43f;
		double doubleNumber = numberFloat;
		
		//examples
		double resultDouble = result;
		System.out.println(resultDouble);
	}

}
