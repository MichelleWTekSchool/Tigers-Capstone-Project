package com.week.nine.day.three;
import java.io.FileNotFoundException;
public class Utilities {
	
	public void doSomething() throws FileNotFoundException, ArrayIndexOutOfBoundsException {
		System.out.println("This method with Throws Exceptions");
	}
	
	
	public void checkName (String name) {
		if (name.contains("Michelle")) {
			System.out.println("Name contains Michelle");
		}else {
			throw new RuntimeException("Name is not Michelle");
		}
}
}