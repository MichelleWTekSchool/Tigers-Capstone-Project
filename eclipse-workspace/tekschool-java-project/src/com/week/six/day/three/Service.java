package com.week.six.day.three;

public class Service {
	//to generate random numbers in any range and for any length
	
	//array covers multiple values
	//create a property; property has no value at the moment
	
	//constructor creates an object / similar to method
		
		int[] numbers; //property OR state
		
		
		public Service(int length) { //length comes from user
			numbers = new int[length];
		}
		
		//generate random numbers between 0 and any range
		//void meaning no return type
		public void generateRandomNumbers (int range) {
			
			for(int i = 0 ; i < numbers.length ; i ++) {
				int number = (int) (Math.random() * range);
				numbers[i] = number;
	}
	}
				//Print all values inside of an array
				public void printValues() {
					for (int number : numbers) {
						System.out.println(number);
	}
}}