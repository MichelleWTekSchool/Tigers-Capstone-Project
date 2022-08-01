package com.week.five.day.two;

public class RecapForEach {
	
	public static void main(String[] args) {
		int[] numbers = {123, 44, 12, 142};
		
		//first find even numbers sum evens only
		
		int result = 0; 
		int resultOdd = 0;
		
		
		for (int number : numbers) {
			
			if(number % 2 == 0) {
				result += number;
				System.out.println("This number is even " + number);
			}else {
				
				resultOdd += number;
			}
		}
	System.out.println("Print result " + result);
	System.out.println("Print result " + resultOdd);
	System.out.println("Sum of both odd and even: " + (result + resultOdd));
}
}