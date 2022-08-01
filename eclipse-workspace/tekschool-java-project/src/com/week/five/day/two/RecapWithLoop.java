package com.week.five.day.two;

public class RecapWithLoop {

	public static void main(String[] args) {
		//(W)(E)(L)(C)...
		
		String text = "Welcome";
		
		char[] textInArray =  text.toCharArray();
		
		for(char character : textInArray) {
			
			System.out.print("(" + character + ")");
		}
	}
	
	
}
