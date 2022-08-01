package com.week.four.day.two;

public class LoopArrayRecap4 {
public static void main(String[] args) {
	//find array double number
	//find sum of all numbers
	
	double[] prices = {3.13, 10.21, 50.00, 15.41, 12.31};
	
	double result = 0;
	
	for(int start = 0 ; start < prices.length ; start ++) {
		
		result += prices[start];
	}
	
	//result += prices[0];
	//result += prices[1];
	//result += prices[2];
	//result += prices[3];
	//result += prices[4];
	
	System.out.println(result);

	
	
}
}
