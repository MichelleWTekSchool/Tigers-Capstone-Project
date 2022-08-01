package com.week.nine.day.one;

public class Human extends BaseClass {

private String firstName;
private String lastName;

public String getFirstName() {
	return firstName;
	
}
public void setfirstName(String firstName) {
	this.firstName = firstName;
	
}
public String getlastName() {
	return lastName;
	
}
public void setlastName(String lastName) {
	lastName = lastName;
}

@Override
public void print() {
//public void print() { //@override
	//System.out.println("First name: " + this.firstName + "Last name " + this.lastName);
}}
