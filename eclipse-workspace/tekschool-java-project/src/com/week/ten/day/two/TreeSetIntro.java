package com.week.ten.day.two;
import java.util.TreeSet;
public class TreeSetIntro {
	
public static void main(String[] args) {
	
	//Not much of an order;ordering as first number '1' , '1'00 , '4' and then alphabetic order 'hello' then 'world'
	
	TreeSet<String> set = new TreeSet<>();
	
	set.add("200");
	set.add("Hello");
	set.add("1");
	set.add("4");
	set.add("world");
		
		for(String value : set) {
			System.out.println(value);
		}
	}
}