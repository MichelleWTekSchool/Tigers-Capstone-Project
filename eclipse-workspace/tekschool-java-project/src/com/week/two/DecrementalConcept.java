package com.week.two;

public class DecrementalConcept {
	public static void main(String[] args) {
		
		//Prefix means before
		//Postfix means after
		
		//int number = 10;
		
		//Option 1
		//number = number - 1;
		
		//Option 2
		//number -= 1;
		
		//Option 3
		//number --;
		
		//System.out.println(number);
				
		int number = 10;
		//prefix
		System.out.println(--number); //=9 (-1 from 10)
		
		System.out.println(number--); //=9 (10 minus 1)
		
		System.out.println(number); //=8 (postfix incremental meaning 9-1 because it pulled the last sysout - 1)
		
	}

}
