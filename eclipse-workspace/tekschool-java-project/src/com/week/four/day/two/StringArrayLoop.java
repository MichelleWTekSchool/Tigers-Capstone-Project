package com.week.four.day.two;

public class StringArrayLoop {
	
	public static void main(String[] args) {

	String[] words = {"Hello", "everyone", "today", "is", "Monday"};
	
	String sentance = "";
	
	for(int index = 0 ; index < words.length ; index ++) {
		
		sentance = sentance + words[index] + " ";
		
	}
	System.out.println(sentance);
}
	
}
