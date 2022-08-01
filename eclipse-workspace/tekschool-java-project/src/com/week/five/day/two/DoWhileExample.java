package com.week.five.day.two;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//String password = "";
		String password = "";
		
	do {
		
		//Do execute this code at least 1 time
		System.out.println("Please Enter Password");
		password = scanner.next();
		
		//check condition to give output to user
		if (password.length() >= 8) {
			System.out.println("Sufficient Length");
		}else {
			System.out.println("Password Insufficient - Less Than 8 Characters");
		}
		
	} while (password.length() < 8);
		scanner.close();
	
	}
}
