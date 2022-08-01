package com.week.three.day.two;

public class IfStatementsEx2 {
	public static void main(String[] args) {
		//activity
		double item1 = 10.10;
		double item2 = 30.31;
		double item3 = 40.50;
		double item4 = 20.89;
		
		//Find the sum of all items: total = 80.90
		
		//Then if the sum of items are greater than or equal 100$ 
		//calculate 3% tax
		//print the total pay
		
		double totalSum = item1 + item2 + item3 + item4;
		System.out.println("Subtotal is ::: $" + totalSum);
		
		if (totalSum >= 100) {
		double tax = (totalSum * 3) / 100;
		double totalPay = tax + totalSum;
		System.out.println("Total price ::: $" + totalPay);
		
		//condition met
			
		}
	}

}
