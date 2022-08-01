package com.week.four.day.one;

public class DoubleArrayNumbers {
	public static void main(String[] args) {
		
		
		//declare and array type double
		double[] numbers = new double[3];
		
		numbers[0] = 31.23;
		numbers[1] = 56.21;
		numbers[2] = 100.00;
		
		//find sum of all elements
		
		double result = 0;
		
		result += numbers[0];
		result += numbers[1];
		result += numbers[2];
		
		System.out.println("Total is " + result);
	}

}
