package com.week.six.day.two;

public class TestPersons {

	public static void main(String[] args) {
		
		Person michelle = new Person();
		michelle.firstName = "Michelle";
		michelle.lastName = "Williams";
		
		String fullName = michelle.getFullName();//returning to me a value; concatination
		System.out.println(fullName);
		
	}
	
}
