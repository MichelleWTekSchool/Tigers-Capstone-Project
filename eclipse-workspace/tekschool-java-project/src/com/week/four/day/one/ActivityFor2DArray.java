package com.week.four.day.one;

public class ActivityFor2DArray {
	public static void main(String[] args) {
		
		int[][] numbers = {
				{12, 32, 43},
				{61, 87, 21,},
				{7, 44, 91,},
				
		};
		
		//Find the value in position index 1,1
		//then find out if the number is odd or even
		
		System.out.println(numbers[1][1]);
		
		if (numbers[1][1] % 2 == 0) {
			System.out.println(numbers[1][1] + "is even");
		}else {
			System.out.println(numbers[1][1] + " is odd");
		}
		
		}
	}