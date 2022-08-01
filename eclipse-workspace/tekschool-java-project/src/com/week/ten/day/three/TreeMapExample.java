package com.week.ten.day.three;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		
		Map<String , Integer> scores = new HashMap<>();
		
		scores.put("John", 40);
		scores.put("Tim", 70);
		scores.put("Nikki", 98);
		scores.put("Jaxck", 5);
		scores.put("Brittney", 100);
		scores.put("Ashley", 81);
		
		System.out.println(scores);
		
		System.out.println("=======================================");
			
			Map<String , Integer> treemap = new TreeMap<>();//treemap orders it internally alphabetically
			
			treemap.put("John", 40);
			treemap.put("Tim", 70);
			treemap.put("Nikki", 98);
			treemap.put("Jaxck", 5);
			treemap.put("Brittney", 100);
			treemap.put("Ashley", 81);
			
			System.out.println(treemap);
			

}
}