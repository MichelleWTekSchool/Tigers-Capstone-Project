package com.week.two.day.three;

public class PrecedenceExample {
	public static void main(String[] args) {
		System.out.println("Hello " + 1 + 2 + 3);
		System.out.println("Hello " + (1+2+3));
		System.out.println(1 +2 + 3 + "Hello");
		
		int age = 36;
		System.out.println("You are not old " + age);
	}

}
