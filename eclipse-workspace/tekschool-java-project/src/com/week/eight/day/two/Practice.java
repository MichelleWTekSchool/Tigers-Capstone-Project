package com.week.eight.day.two;

public class Practice {
public static void main(String[] args) {
	//String is immutable meaning can not be changed its value
	//size and capacity of string is always the same
	//string is a series of characters in java
	
	String name = "Tekscool";
	String result = name.concat("Classes");
		System.out.println(result);
	
	//String concat => I can use (+) operator to concat two strings
	String city1 = "Alexandria";
	String city2 = "Arlington";
		System.out.println(city1 + " , " + city2);
	
	//concat String with two ints
	String str1 = "Salary:";
	int salary = 100;
	int bounes = 20;
		System.out.println(str1 + " " + (salary + bounes));
}
}
