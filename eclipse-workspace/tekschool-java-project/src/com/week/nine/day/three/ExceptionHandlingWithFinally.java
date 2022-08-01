package com.week.nine.day.three;

public class ExceptionHandlingWithFinally {
	public static void main(String[] args) {
		int numberA = 10;
		int numberB = 2;
		
		try {
			int result = numberA/numberB;
			System.out.println(result);
			
		}catch (RuntimeException exception) {
			System.out.println("Exception happened" + exception.getMessage());
		}finally {
			System.out.println("Finally block is running");
}
}
}
