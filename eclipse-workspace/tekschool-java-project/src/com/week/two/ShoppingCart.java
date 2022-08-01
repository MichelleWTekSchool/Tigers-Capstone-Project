package com.week.two;

public class ShoppingCart {

	public static void main(String[] args) {
		//Solve this problem
		//Apple 2 lb * 2.31$ /lb
		//Orange 3 lb * 4.23$ / lb
		
		//How much will you have to pay?
		
		//Create variables for apple
		double applePrice = 2.31;
		int appleWeight =2;
		
		//Create variables for orange
		double orangePrice = 4.23;
		int orangeWeight = 3;
		
		//Create variable for totalPay
		double totalPay = 0;
		
		double appleTotal = applePrice * appleWeight;
		double orangeTotal = orangePrice * orangeWeight;
		
		totalPay = appleTotal + orangeTotal;
		
		System.out.println(totalPay);
	}
}
