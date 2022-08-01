package com.week.nine.day.three;
public class ExceptionWithThrows {
public static void main(String[] args) {
	
	Utilities utilities = new Utilities();
	
	try {
		utilities.checkName("JOE");
		}catch (RuntimeException e) {
	System.out.println(e.getMessage());
	
}
}
}