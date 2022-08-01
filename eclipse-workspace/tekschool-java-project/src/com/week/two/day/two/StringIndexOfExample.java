package com.week.two.day.two;

public class StringIndexOfExample {
	
	public static void main(String[] args) {
		
		String text = "HEllo";
		
		int indexOfO = text.indexOf('o'); //lower o vs. O get the correct index of 4 
		//-1 means not found etc
		
		System.out.println(indexOfO);
		
		String textInUpperCase = text.toUpperCase();
		int indexOfCapsO = textInUpperCase.indexOf('O');
		
		System.out.println(indexOfCapsO);
		
	}

}
