package com.week.five.day.three;

import java.util.Scanner;

	public class RecapWhileLoop {
		public static void main(String[] args) {
			
			//Ask user enter a number
			//Stop asking when user enters 10
			
			Scanner scanner = new Scanner(System.in);
			
			boolean stopAsking = false; 
			
			while(stopAsking == false) {
			int number = scanner.nextInt();
			
			if (number == 10) {
			System.out.println("User entered value 10");
			stopAsking = true;
			
			}else {
			System.out.println("Try Again");
			}
		
				}
			scanner.close();
			}
		
				}