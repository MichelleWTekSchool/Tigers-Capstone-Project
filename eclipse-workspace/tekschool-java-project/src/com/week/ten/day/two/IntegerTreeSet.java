package com.week.ten.day.two;
import java.util.TreeSet;
public class IntegerTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(50);
		set.add(120);
		set.add(1);
		set.add(33);
		set.add(100);
		
		for(Integer value : set) {
			System.out.println(value);
			
		}
	}
}
