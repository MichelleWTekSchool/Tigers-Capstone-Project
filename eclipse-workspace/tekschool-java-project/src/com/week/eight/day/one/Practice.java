package com.week.eight.day.one;

public class Practice {
public static void main(String[] args) {
	//Stack and heap
	//referencing
	//if two primative data types how do we compare them?
	
	int num1 = 10; 
	int num2 = 10; 
	
	System.out.println(num1 == num2);
	
	//num1 == num2 => used as equality operator
	//num1 = num2 => assignment operator
	
	//we have two string literals string constants
	String str1 = "David";
	String str2 = "David";
	System.out.println(str1 == str2);
	
	//we have two string objects
	String str3 = new String("Ahmed");
	String str4 = new String("Ahmed");
	System.out.println(str3 == str4);
	System.out.println(str3.equals(str4));
}
}
