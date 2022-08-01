package com.week.five.day.two;

import java.util.Scanner;

public class WhileLoopExample2 {
public static void main(String[] args) {
	//Check password length - 8 characters or more
	//Ask user to enter new password
	//Check the length
	
	//String passWordString.length();
	
	Scanner scanner = new Scanner(System.in);
	String password = "";
	
	while (password.length() <= 8) {
		System.out.println("Enter 8 Character+ Password");
		password = scanner.next();
		
		int length = password.length();
		if (length >= 8 ) {
			System.out.println("Password Accepted");
		}else {
			System.err.println("Please Try Again. Enter 8 Character+ Password");
		}
		}
	scanner.close();
}
}
