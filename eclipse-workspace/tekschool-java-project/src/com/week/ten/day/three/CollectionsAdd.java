package com.week.ten.day.three;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsAdd {
//collections.addAll();
	public static void main(String[] args) {
	
	ArrayList<String> students = new ArrayList<>();
	
	students.add("Michelle");
	students.add("Elle");
	students.add("Miche");
	
	Collections.addAll(students, "Daniel" , "Zeke" , "Johhny" );
	
	Collections.addAll(students, "Lenny" , "Greg" , "George" , "Nancy" , "Karen");
	
	System.out.println(students);
	
}}