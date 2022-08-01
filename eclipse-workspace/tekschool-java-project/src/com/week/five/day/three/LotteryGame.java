package com.week.five.day.three;

import java.util.Arrays;

public class LotteryGame {
	
	//5 lottery numbers between 1-57; should not be repetitive
	
	public static void main(String[] args) {
		
	int[] lotteryNumbers = new int[5];
	
	for (int index = 0 ; index < lotteryNumbers.length ; index ++) {
		int random = (int) (Math.random() * 57);
		
		lotteryNumbers[index] = random;
	}
	System.out.println(Arrays.toString(lotteryNumbers));
	
	
}
	
	}
