package com.prep.random;

public class NumbersService {
	
	private int[] numbers;
	
	public NumbersService(int length) {
		numbers = new int[length];
		
	}

	public void generateRandomNumbers (int range) {
		for (int i = 0; i < numbers.length; i ++) {
			numbers[i] = (int) (Math.random() *range);
		}
	}
	
	public void print() {
		for (int i = 0 ; i < numbers.length ; i ++) {
			System.out.println(numbers[i]);
		}
	}
	public int countDuplicate(int targetNumber) {
		int counter = 0; 
		for (int i = 0 ; i < numbers.length ; i ++) {
			if (numbers[i] == targetNumber)
				counter ++;
		}
		return counter;
		}
	}