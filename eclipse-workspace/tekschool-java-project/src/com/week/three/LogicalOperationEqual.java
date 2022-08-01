package com.week.three;

public class LogicalOperationEqual {
	public static void main(String[] args) {
		// == is equal to
		
		int numberA = 10;
		int numberB = 40;
		
		boolean numberEqual = numberA == numberB;
		System.out.println(numberEqual);
		
		// != is not equal to
		
		boolean notEqualTo = numberA != numberB;
		System.out.println(notEqualTo);
		
		// > greater than
		boolean greaterThan = numberA > numberB;
		System.out.println(greaterThan);
		
		// < lesser than
		boolean lesserThan = numberA < numberB;
		System.out.println(lesserThan);
		
		// >= greater than or equal to
		boolean greaterEqual = numberA >= numberB;
		System.out.println(greaterEqual);
		
		// <= lesser than or equal to
		boolean lesserEqual = numberA <= numberB;
		System.out.println(lesserEqual);

}}
