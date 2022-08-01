package com.week.ten.day.two;

import java.util.HashMap;
import java.util.Set;

public class LoopingHashMap {

	
	public static void main(String[] args) {
		HashMap<String , Integer> values = new HashMap<>();
		values.put("Washington", 56);
		values.put("Texas", 24);
		values.put("North Carolina", 23);
		values.put("North Carolina", 59);//again will take higher value of a duplicate
		
		Set<String> keys = values.keySet();
		
		for(String key: keys) {
			int score = values.get(key);
		
		if(score >= 50) {
			System.out.println("Good Job " + key);
		} else {
			System.out.println("Practice More " + key);
		}
		
		
	}
}
}