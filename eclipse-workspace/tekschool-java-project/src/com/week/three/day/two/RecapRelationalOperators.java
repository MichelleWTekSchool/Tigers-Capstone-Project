package com.week.three.day.two;

public class RecapRelationalOperators {
	
	public static void main(String[] args) {
		double numberA = 10.20;
		double numberB = 20.10;
		
		boolean isEqual = numberA == numberB;
		System.out.println("Two numbers are equal: " + isEqual);
		
		boolean notEqual = numberA != numberB;
		System.out.println("Two numbers not equal: " + notEqual);
		
		boolean isLessThan = numberA < numberB;
		System.out.println("Numbers less than B: " + isLessThan);
		
		boolean isGreaterThan = numberA > numberB;
		System.out.println("Numbers greater than B: " + isGreaterThan);
		
		boolean lessOrEqual = numberA <= numberB;
		System.out.println("Is A less than B: " + lessOrEqual);
		
		boolean greaterOrEqual = numberA >= numberB;
		System.out.println("Is A more than B: " + greaterOrEqual);
		
	}

}
