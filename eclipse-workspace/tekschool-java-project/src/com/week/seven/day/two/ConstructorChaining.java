package com.week.seven.day.two;

public class ConstructorChaining {
	
public ConstructorChaining() {
	System.out.println("This is default constructor");
}

//public ConstructorChaining(); two default constructor chaining is not allowed; duplicate X no - create a new one below
	public ConstructorChaining(String text) {
	
//"THIS" is a RESERVED key WORD referring to properties methods and constructor of same class
	this();//chaining a a constructor but only for THIS class
	System.out.println("This is constructor with text parameter " + text);
}

public ConstructorChaining(String text , int number ) {
	this(text);
	System.out.println("This is constructor with 2 parameters " + text + " " + number);
}

public ConstructorChaining(String text , int number , String anotherText) {
	this("Some text" , 190);
	
}
}
