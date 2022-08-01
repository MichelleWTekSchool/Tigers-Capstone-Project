package review.java;

import java.util.Scanner;

public class ScannerWithIfSelections {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Age");
		
		int age = scanner.nextInt();
		
		//if, else if , and else
		
		if(age <= 0) {
			System.err.println("Please enter proper age more than 0");
			
		}else if (age < 0 && age < 4) {
			System.out.println("You are still a baby");
			
		}else if(age <=4 && age < 6) {
			System.out.println("You are a kindergarten");
			
		}else if(age <=6 && age <10) {
			System.out.println("You are in elementary school");
			
		}else if(age >= 10 && age <14) {
			System.out.println("You are in middle school");
		}
scanner.close();
}
}