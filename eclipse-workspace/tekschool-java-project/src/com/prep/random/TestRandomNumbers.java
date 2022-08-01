package com.prep.random;

public class TestRandomNumbers {
	public static void main(String[] args) {
		
		//CONSTRUCTOR is similar to METHOD but is meant to instantiate an OBJECT
		
		NumbersService service = new NumbersService(100);
		service.generateRandomNumbers(10);
		
		//service.print();
		
		int count = service.countDuplicate(2);
		System.out.println(count);
	}
}
