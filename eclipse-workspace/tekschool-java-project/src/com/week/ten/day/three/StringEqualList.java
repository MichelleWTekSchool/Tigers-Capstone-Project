package com.week.ten.day.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringEqualList {
	
	public static void main(String[] args) {
		
		List<String> students = new ArrayList<>();
		
		Collections.addAll(students, "David" , "Michelle" , "Sara" , "Mick", "Bob" , "Jim");
		
		for(String name : students) {
			
			if(name.equals("David")) {
			System.out.println(name);
		}
}
}
}