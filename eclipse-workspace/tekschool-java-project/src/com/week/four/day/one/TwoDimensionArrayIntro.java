package com.week.four.day.one;

public class TwoDimensionArrayIntro {
	
	public static void main(String[] args) {
		
		//Declare 2D arrays
		int[][] numbers = new int[2][2];
		
		//assign values
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[1][0] = 30;
		numbers[1][1] = 40;
		
		System.out.println(numbers[1][0]);
		
		//or
		//int number = numbers[1][0];
		//System.out.println(number);
	}

}
