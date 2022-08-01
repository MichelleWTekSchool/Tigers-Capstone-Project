package com.week.five.day.one;

import java.util.Scanner;

public class RecapScannerAndArray {
	public static void main(String[] args) {
		
		//create a program take 5 value any number and find sum
		
		Scanner scanner = new Scanner(System.in);
		
		double[] numbers = new double[5];
		
		for (int index = 0 ; index < numbers.length ; index ++) {
			System.out.println("Please enter a number");
			
			numbers[index] = scanner.nextDouble();
			
	}
		double result = 0;
		for (int index = 0; index < numbers.length; index ++) {
			
			result += numbers[index];
			
		}
			System.out.println("The result is " + result);
			scanner.close();
}
}
