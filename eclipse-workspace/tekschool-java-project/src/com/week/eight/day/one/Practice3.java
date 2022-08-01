package com.week.eight.day.one;

public class Practice3 {
	public static void main(String[] args) {
		//Primitive data type are always stored inside stack
		//Objects are stored in heap
		//String literals are stored in string pool
		//Hash codes point to different objects in pool
		
		//String literal
		String state = "Omaha";
		System.out.println(state.hashCode() + " " + state);//pulls hashcode
		//String Object
		String city = new String ("Cali");
		System.out.println(city.hashCode() + " " + city);
		//String Object
		String state2 = new String ("Omaha");
		
		System.out.println(state == state2);//compares to equality operator will be false; compares CODE not VALUE
		System.out.println(state2.hashCode() + " " + state2);//same hascode as state since the value is similar
		
		//HAshcodes are used to refer to objects in heap memory
		//each object has its own code in heap
		//
	}

}
