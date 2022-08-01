package com.week.nine.day.two;

public class Test {
public static void main(String[] args) {
	//Browser object = new Browser(); we are not allowed to create obj of an interface
	
	//Option of instantiation
	Chrome object = new Chrome();
	object.openBrowser();
	//}}

	//useful for only one implementation
	Browser browserObject = new Chrome();
	browserObject.openBrowser();
	
	Browser browser = new Firefox();
	browser.openBrowser();
}
}