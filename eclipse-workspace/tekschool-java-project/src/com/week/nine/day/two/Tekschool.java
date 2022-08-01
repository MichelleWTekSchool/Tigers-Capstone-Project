package com.week.nine.day.two;

public class Tekschool {
	public static void main(String[] args) {
		Instructor instructorObject = new Instructor();
		instructorObject.fullName = "Moh Shok";
		instructorObject.responsibility();
		instructorObject.printFullName();
		
		Students students = new Students();
		students.fullName = "Michelle W.";
		students.responsibility();
		students.printFullName();
		
		
	//Personal personal = new Personal();
		//can not instantiate from usage
		
	}
}
