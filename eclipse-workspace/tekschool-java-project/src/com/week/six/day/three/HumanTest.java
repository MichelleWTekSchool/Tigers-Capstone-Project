package com.week.six.day.three;

public class HumanTest {
	public static void main(String[] args) {
		
		Human anotherPerson = new Human("John" , "Smith");
		System.out.println(anotherPerson.firstName);
		System.out.println(anotherPerson.lastName);
		
		System.out.println(anotherPerson.getFullName());
	}
}
