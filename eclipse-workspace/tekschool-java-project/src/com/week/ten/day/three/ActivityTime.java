package com.week.ten.day.three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ActivityTime {
	public static void main(String[] args) {
		
		Map<String , Integer> scores = new HashMap<>();
		
		scores.put("John", 40);
		scores.put("Tim", 70);
		scores.put("Nikki", 98);
		scores.put("Jaxck", 5);
		scores.put("Brittney", 100);
		scores.put("Ashley", 81);
		
		List<String> students = new ArrayList<>();
		
			Set<String> keys = scores.keySet();
		
		for(String key : keys) {
			int score = scores.get(key);
			if(score >= 50) {
				students.add(key);
			}
		}
			System.out.print(students);
			
	}
}
