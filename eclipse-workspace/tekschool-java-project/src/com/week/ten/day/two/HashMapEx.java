package com.week.ten.day.two;

import java.util.HashMap;

public class HashMapEx {
	
public static void main(String[] args) {
	
	HashMap<Integer , String> citiesMap = new HashMap<>();
	
	citiesMap.put(1, "Austin");
	citiesMap.put(2, "Dallas");
	
	System.out.println(citiesMap);
	
	System.out.println("================");
	citiesMap.put(2, "Wells Branch");//this overrides what was originally put in
	
	System.out.println(citiesMap);
	
}
}
