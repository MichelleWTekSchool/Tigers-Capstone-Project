package com.week.five.day.one;

public class SplitStringAndLoop {
	
	public static void main(String[] args) {
		//Split String.
		
		String text = "Today is monday. we have java class";
		
		//split with space
		//String[] textSplitted = text.split(" ");
		
		//String[] textSplitted = text.split("have"); 
		//would remove the word "have"
		//split where "have" would be
		
		String[] textSplitted = text.split("\\.");
		
		//char letter = text.toCharArray();
		//String[] textSplitted = text.charArray("\\.");
		
		for (int index = 0 ; index < textSplitted.length ; index ++) {
			System.out.println(textSplitted[index]);
		}
		
	}

}
