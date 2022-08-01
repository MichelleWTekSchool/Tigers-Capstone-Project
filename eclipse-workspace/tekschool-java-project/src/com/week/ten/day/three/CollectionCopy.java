package com.week.ten.day.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionCopy {
	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		Collections.addAll(fruits, "Apple", "Pineapple", " Grapes", "Kiwi");

		//List<String> copy = new LinkedList<>(fruits);

		//System.out.println(copy);
		
		List<String> copy = new ArrayList<>(fruits.size());
		Collections.addAll(copy, "A" , "B" , "C" , "C");
		
		Collections.copy(copy, fruits);
		System.out.println(copy);

}
}
