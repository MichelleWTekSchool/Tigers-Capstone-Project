package com.week.ten.day.one;

public class Student {
	
	//Private makes only avail to this class
	private String firstName;
	private String lastName;
	private int score;
	
	//must use getter and setters
	public Student(String firstName, String lastName, int score) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.score = score;
	}
	public String getFirstName1() {
		return firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName1() {
		return lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getScore() {
		return score;
	}
}
