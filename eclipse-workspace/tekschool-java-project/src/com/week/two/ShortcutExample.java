package com.week.two;

public class ShortcutExample {
	public static void main(String[] args) {
		double appleTotalPrice = 10.45; //Primitive data types
		double orangeTotalPrice = 20.12;
		double sodaTotalPrice = 30.56;
		
		
		double totalToPay = 0;
		
		totalToPay += appleTotalPrice;// Shortcut assignment operations
		totalToPay += orangeTotalPrice;
		totalToPay += sodaTotalPrice;
		
		//shortcut operator += to find out how much to pay
		
		System.out.println("Total to Pay Before Tax $" + totalToPay); //Concatenation using plus sign
		
		//6% tax
		
		double tax = (totalToPay * 6/100);//Precedence, mathematics
		System.out.println("Tax amount is $" + tax);
		
		totalToPay = tax;//Shortcut assignment operations
		
		System.out.println("Payable after Tax $" + totalToPay);
		
		
		
				
	}

}
