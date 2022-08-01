package com.week.four.day.two;

public class ArrayRecap {
	public static void main(String[] args) {
		int[] numbers = new int[4];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		
		//why is numbers[3] = 0?
		//new int is fixed in size for 4 index/elements 
		//if you do not assign a value it will assign zero
		//if no value is assigned = 0
		//fault value for int is 0
	}

}
