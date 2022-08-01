package com.week.five.day.two;

public class IntroToWhileLoop {

	public static void main(String[] args) {
		//not recommended to use for array or collections
		//based on condition
		//count from 1 to 10; using while loop
		
		int counter = 1;
		
		while (counter <= 10) {
			System.out.println("This is inside while loop");
			System.out.println(counter);
			counter ++;
		}
	System.out.println("Outside while loop should print only one time");
}
}