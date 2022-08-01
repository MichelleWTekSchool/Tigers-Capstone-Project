package com.week.nine.day.three;

public class ExceptionExample {

	public static void main(String[] args) {
	int numberA = 10;
	int numberB = 0;
	
	try {
		int result = numberA / numberB;
		System.out.println(result);
		
	}catch(ArithmeticException exception) {
	System.out.println("Exception happened");
	System.out.println("Exception message is " + exception.getMessage());
	}
}}