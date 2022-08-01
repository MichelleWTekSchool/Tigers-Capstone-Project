package com.week.seven.day.three;

public class IntroToFinalKeyword {
//Keyword that you can use for a variable, class or method
	//variable: only assigns 1 time
	//method: the method cannot override
	//class: class can not inherit
	
public final String name = "Some name";

public IntroToFinalKeyword() {
}
public void functionMethod() {
	String schoolName = "TekSchool";
	schoolName = "Another school";
	System.out.println(schoolName);
}
}
