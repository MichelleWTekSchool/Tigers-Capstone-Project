package com.week.five.day.three;

public class ClassExampleLoops {
	public static void main(String[] args) {
		int[] lotteryWinner = new int[5];
		for (int index = 0; index < lotteryWinner.length; index ++) {
			
			int random = (int) (Math.random() * 57);
			lotteryWinner[index] = random;
			
		}
		//System.out.println(Arrays.toString(lotteryWinner);
		
		for (int index = 0; index < lotteryWinner.length ; index ++) {
			
			System.out.print(lotteryWinner[index]);
			
			if (index < lotteryWinner.length - 1) {
			System.out.print(" , ");
			}
		}
	}
}

