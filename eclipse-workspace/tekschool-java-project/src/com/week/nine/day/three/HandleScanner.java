package com.week.nine.day.three;

import java.util.Scanner;

public class HandleScanner {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

	try {
		int number = scanner.nextInt();
		System.out.println("Number is " + number);
		
	}catch (Exception e) {
		System.out.println("Exception Happened ");
		System.out.println("Please provide numbers only");
		
	}finally {
		scanner.close();
}
}
}