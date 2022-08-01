package com.week.five.day.three;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double result = 0;
		
		do {
			System.out.println("Enter any number");
			double number = scanner.nextDouble();
			result += number;
			
		}while (result <100);
		
		System.out.println("You reached 100");
		System.out.println(result);
		scanner.close();
		}
	}
//video at 1:14