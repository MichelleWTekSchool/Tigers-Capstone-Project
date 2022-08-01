package com.week.nine.day.one;

public class ChromeBrowser implements Browser { //like extend

	@Override	
public void openBrowser() {
	System.out.println("Opening Safari Browser");
}
public void closeBrowser() {
	System.out.println("Closeing Safari Browser");
}
public void navigate() {
	System.out.println("Navigating Safari Browser");
	
}
}
