package com.week.six.day.two;

public class TestOddEven {

	public static void main(String[] args) {
		FindEvenAndOdd object =  new FindEvenAndOdd();
		
		object.findEven(30, 50);
		object.findOdds(10, 15);
		object.findEven(30, 65);//method didnt work so it didnt print
	}
	
	
}
