package com.week.ten.day.three;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Activity {
public static void main(String[] args) {
	List<Integer> numbers = new LinkedList<>();
	
	Collections.addAll(numbers, 12, 13, 14, 15, 65, 76, 86, 87);
	
	Collections.sort(numbers);
	int largest  = numbers.get(numbers.size() - 1);
	System.out.println(largest);
	
	System.out.println("Lowest " + numbers.get(0));
	
	Collections.reverse(numbers);
	System.out.println(numbers.get(0));
	
	int max = Collections.max(numbers);
	System.out.println(max);
}
}
