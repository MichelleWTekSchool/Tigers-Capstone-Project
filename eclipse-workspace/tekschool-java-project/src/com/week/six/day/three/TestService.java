package com.week.six.day.three;

public class TestService {
	
	public static void main(String[] args) {
		//Ex. 2 is the length of the array
		Service myServiceObject = new Service(2);
		
		myServiceObject.generateRandomNumbers(100);
		
		myServiceObject.printValues();
	}

}
