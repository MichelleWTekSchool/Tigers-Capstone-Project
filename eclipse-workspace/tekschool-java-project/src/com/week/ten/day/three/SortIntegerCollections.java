package com.week.ten.day.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIntegerCollections {

	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();

		Collections.addAll(numbers, 12, 11, 134, 123, 34, 6, 76, 76, 765, 98);

		System.out.println("Original Order");
		System.out.println(numbers);

		Collections.sort(numbers);// Sort order of values ++

		Collections.reverse(numbers);
	}
}
