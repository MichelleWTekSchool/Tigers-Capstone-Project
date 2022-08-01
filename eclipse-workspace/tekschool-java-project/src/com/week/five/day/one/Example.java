package com.week.five.day.one;

public class Example {
public static void main(String[] args) {
	//				1000.00		2000.00		3000.00
	String[] numbers = {"100000" , "200000" , "300000"};
	
	for (int i = 0; i < numbers.length; i ++) {
		
		String value = numbers[i];
		String amount  = value.substring(0, 4);
		String decimalPoint = value.substring(4);
	
	String amountwithDecimal = amount + "." + decimalPoint;
	System.out.println(amountwithDecimal);
	
	}
	
	
	
}
}
