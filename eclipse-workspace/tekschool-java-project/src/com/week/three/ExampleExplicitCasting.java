package com.week.three;

public class ExampleExplicitCasting {
	public static void main(String[] args) {
		double numberA = 40.3;
		double numberB = 10.3;
		
		double result = numberA * numberB;
		System.out.println(result);
		//not clean but works
		System.out.println((int) result);
		//clean and works
		
		//int resultInt = (int) result;
		long resultInt = (long) result;
		System.out.println(result);
	}

}
