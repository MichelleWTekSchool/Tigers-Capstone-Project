package com.week.ten.day.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingStringWithCollections {
	
public static void main(String[] args) {
	List<String> students = new ArrayList<>();
	//Ascending
		//A to Z
	Collections.addAll(students, "John", "James" ,  "Tammy" , "Lu Beth" , "Emme Lu" , "David" , "Mike");
	System.out.println(students);//puts them in order as they were entered
	
	Collections.sort(students);//alphabetic order
	System.out.println(students);
	
	//Descending Z to A
	Collections.reverse(students);
	System.out.println(students);
	
}
}
