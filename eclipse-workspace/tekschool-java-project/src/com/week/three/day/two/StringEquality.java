package com.week.three.day.two;

public class StringEquality {
public static void main(String[] args) {
	
	String name = "Michelle";
	String name2 = "MichellE";
	
	//to check the equality of the string you can use ==
	//to check the equality you have to use equal method
	
	//introducing equal method
	
	boolean equalityCheck = name.equals(name2);
	System.out.println(equalityCheck);
	
	boolean checkIgnoreCase = name.equalsIgnoreCase(name2);
	System.out.println(checkIgnoreCase);
}
}
