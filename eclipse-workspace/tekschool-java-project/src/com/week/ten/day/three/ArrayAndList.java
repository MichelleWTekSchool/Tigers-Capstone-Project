package com.week.ten.day.three;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayAndList {
	
	public static void main(String[] args) {

		Integer[] numbers = { 10, 25, 3, 44, 55, 30 };

		// Arrays.asList(numbers);//primitive data type

		List<Integer> listNumbers = Arrays.asList(numbers);// wrapper data type
		System.out.println(listNumbers);

		Collections.sort(listNumbers);
		System.out.println(listNumbers);
	}
}
