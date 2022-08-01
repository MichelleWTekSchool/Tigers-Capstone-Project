package com.week.one.day.three;

public class TestingPriceAndWeight {

	public static void main(String[] args) {
	
	PriceAndWeight appleProduct = new PriceAndWeight();
	
	appleProduct.price = 1.2;
	
	appleProduct.weight  =0.01f;
	
System.out.println(appleProduct.price);
	
	PriceAndWeight orangeProduct = new PriceAndWeight();
	orangeProduct.price = 2.3;
	
	orangeProduct.weight = 0.43f;
	
	System.out.println(orangeProduct.price);
	
	}
}
