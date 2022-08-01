package com.week.four.day.two;

public class LoopArrayRecap3 {
	
	public static void main(String[] args) {
		
		//Given array in double number
		//Find sum of all numbers
		
		double[] prices = {3.13, 10.21, 50.00, 15.41, 12.31};
			double result = 0;
			for (int index = 0 ; index < prices.length ; index ++) {
			double price =	prices[index];
			result += price;
			
			//or simply result += prices[index]; w/out result += price as above
			}
	
			System.out.println(result);
		
		}
}