package com.week.three;

public class LogicalOperationOR {

	public static void main(String[] args) {
		
		// OR logical operation || as long as one is true... it is true
		
		boolean money = true;
		
		boolean car = false;
		
		boolean timeToShop = money || car;
		
		System.out.println(timeToShop);
		
		int numberA = 10;
		int numberB = 20;
		
		boolean result = numberA == 10 || numberB > 30;
		System.out.println(result);
	}
}
