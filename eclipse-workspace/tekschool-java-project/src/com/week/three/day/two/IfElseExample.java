package com.week.three.day.two;

public class IfElseExample {
	
	public static void main(String[] args) {
		//activity
		double item1 = 10.10;
		double item2 = 30.31;
		double item3 = 40.50;
		
		//Find the sum of all items
		double totalSum = item1 + item2 + item3;
		//if greater than equal 100 tax 3% else 2%
		System.out.println("Subtotal is $" + totalSum);
		
		if (totalSum >= 100) {
		double tax = (totalSum * 3) / 100;
		double totalPay = totalSum + tax;
		System.out.println("Subtotal is ::: $" + totalSum);
		
	    } else {
		System.out.println("Calculate tax with 2%");
		double tax = (totalSum * 2) / 100;
		double totalPay = tax + totalSum;
		
		System.out.println("Total to pay $" + totalPay);
		
		//condition met
		//end video at 245
			
		}
	}

}
