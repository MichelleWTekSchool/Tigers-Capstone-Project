package com.week.ten.day.two;
import java.util.HashMap;
public class IntroToHashMap {
	
public static void main(String[] args) {
	
	//Instantiate object to hashmap class
	HashMap<Integer , String> map = new HashMap<>();
	
	//put to add pair of args; passing key and value
	map.put(1, "Austin");
	map.put(2, "Falls Church");
	map.put(3, "Alexandria");
	
	System.out.println(map.size());
	
	//How to retrieve values for each key via getMethod
	String city = map.get(2);//grab the key...
		System.out.println(city);//to get the map
	
	map.remove(1);//remove the key that you are passing
	
	map.clear();//Clear the map
	
	map.isEmpty();//Returns...
	
	
	
}
}