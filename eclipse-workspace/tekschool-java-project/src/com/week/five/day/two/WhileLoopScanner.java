package com.week.five.day.two;

import java.util.Scanner;

public class WhileLoopScanner {
	
	public static void main(String[] args) {
		//Ask user repeatedly to enter a number(int) until user enters 10;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int userInput = scanner.nextInt();
			while (userInput != 10) {
			
		System.out.println("Enter a Number");
			userInput = scanner.nextInt();
	}
		System.out.println("User Entered 10 Finally");
			scanner.close();
}
}