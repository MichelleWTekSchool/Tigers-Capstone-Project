package com.week.seven.day.three;

public class IntroductionToStaticKeyword {
	public static void main(String[] args) {
		
		Constants object1 = new Constants();
		
		System.out.println(object1.googleUrl);

		Constants object2 = new Constants();
		System.out.println(object2.googleUrl);
		
		object1.googleUrl = "https://www.google.com";
		System.out.println(object2.googleUrl);
		
		object1.price = 100;
		System.out.println("Price from object1 " + object1.price);
		
		System.out.println(object2.price);
	}
}
