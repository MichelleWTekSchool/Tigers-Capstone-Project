package com.week.five.day.three;

import java.util.Scanner;

public class WhileLoopSumNumbers {
public static void main(String[] args) {
	//Ask user input to input numbers
	//then sum numbers
	//stop asking user sum when reach 100
	
	Scanner scanner = new Scanner(System.in);
	
	double sum = 0;
	
	while (sum < 100);
	System.out.println("Enter any number");
	
	double input = scanner.nextDouble();
	
	sum += input; 
	
	System.out.println("You reach 100 or more");
	System.out.println(sum);
	scanner.close();
}
}
