package com.week.four.day.two;

public class LoopArrayRecap2 {
	
	public static void main(String[] args) {
		//increment after the first loop
		//find all numbers from all even numbers 0 to 20
		
		for(int start = 0; start <= 20 ; start ++) {
			System.out.println(start);
			
			if(start % 2 == 0) {
				System.out.println("These is even...." + start);
				
			}else {
				
				System.out.println("This is odd ... " + start);
			}
		}
		
		
	}

}
