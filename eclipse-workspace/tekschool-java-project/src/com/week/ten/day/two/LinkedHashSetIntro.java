package com.week.ten.day.two;
import java.util.LinkedHashSet;
public class LinkedHashSetIntro {
	
public static void main(String[] args) {
	
	LinkedHashSet<String> set = new LinkedHashSet<>();
	set.add("Michelle");
	set.add(null);
	set.add(null);
	
	System.out.println(set);
	
	for(String value : set) {
		System.out.println(value.toUpperCase());
	}
}
}