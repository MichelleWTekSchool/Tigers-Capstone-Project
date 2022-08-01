package com.week.four.day.two;

public class LoopArrayDecrementTwo {
	
	public static void main(String[] args) {
		
		int[] numbers = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
		
		for (int index = 9 ; index >= 0 ; index --) {
			
			// for (int index = numbers.length -1 ; index >= 0 ; index --) { 
			//uses length to figure out how long; must use - 1 in code
			
			System.out.println(numbers[index]);
			
			
		}
	}

}
