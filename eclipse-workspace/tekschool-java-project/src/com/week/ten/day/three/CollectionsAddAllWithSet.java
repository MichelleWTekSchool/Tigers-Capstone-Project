package com.week.ten.day.three;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionsAddAllWithSet {
	
	public static void main(String[] args) {
		
		Set<Integer> numbers = new HashSet<>();
		
		Collections.addAll(numbers, 12 , 12, 345, 56, 65, 87, 87);
		
		System.out.println(numbers);//no duplicate numbers; use array list for duplicates
		
		numbers.remove(12);
		
		System.out.println(numbers);
	}

}
