package com.week.one.day.three;

public class HumanTesting {
	
	public static void main(String[] args) {

	Human firstObject = new Human();
	
	firstObject.name = "Michelle";
	firstObject.birthday = "02/10/1986";
	firstObject.gender = 'F';
	firstObject.height = 73;
	firstObject.age = 34;
	firstObject.salary = 155000;
	
	Human secondObject = new Human();
	
	secondObject.name = "Tumnus";
	secondObject.age = 11;
	
	Human thirdObject = new Human();
	
	thirdObject.name = "Pickles";
	thirdObject.age = 11;
	
	System.out.println(firstObject.name);
	
} 
}