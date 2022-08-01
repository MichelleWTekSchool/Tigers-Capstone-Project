package com.week.four.day.one;

public class ActivityArray {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[4];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		
		//using * multiply all numbers to the result
		
		double result = 3;
		
		result *= numbers[0];
		result *= numbers[1];
		result *= numbers[2];
		result *= numbers[3];
		
		// 3*= 10
		//30 *= 20
		//600 *= 30
		//18000*= 40
		
		System.out.println("Total is " + result);
		
		
	}

}
