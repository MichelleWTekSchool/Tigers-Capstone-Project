package com.week.five.day.one;

public class ForEachWithString {

	public static void main(String[] args) {
		
		String[] numbers = {"100013" , "200023" , "300001"} ;
			
		double result = 0;
		
		for (String value : numbers) {
			
			String amount = value.substring(0,4);
			String decimals = value.substring(4);
			
			String amountConcat = amount + "." + decimals;
			
			System.out.println(amountConcat);
			
		double converted = Double.parseDouble(amountConcat);
			result += converted;
		}
			System.out.println(result);
			
	}}