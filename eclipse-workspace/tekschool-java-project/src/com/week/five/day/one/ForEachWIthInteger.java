package com.week.five.day.one;

public class ForEachWIthInteger {
	
	public static void main(String[] args) {
		 int[] numbers = {10, 20 , 202, 3300 , 4040, 33, 101};
		 //sum of all numbers +=
		 
		 int result = 0;
		 for (int value : numbers) {
			 result += value; 
		 }
			 System.out.println(result);
		 }
}
