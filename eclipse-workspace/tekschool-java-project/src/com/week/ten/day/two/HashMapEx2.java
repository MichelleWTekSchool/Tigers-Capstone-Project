package com.week.ten.day.two;
import java.util.HashMap;
public class HashMapEx2 {
	
public static void main(String[] args) {
	
	HashMap<String , Integer> values = new HashMap<>();
	
	//Execution top to bottom
		values.put("Washington", 341);
		values.put("Texas", 243);
		values.put("North Carolina", 323);
		values.put("North Carolina", 2345);//4 in all but the lower value duplicate is overridden
		
		System.out.println(values.size());//3 will be the output since the highest value for 4 was taken
		System.out.println(values);
}
}
//238