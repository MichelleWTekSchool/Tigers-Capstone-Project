package com.week.ten.day.one;

import java.util.ArrayList;

public class ArrayListRemove {
	
	public static void main(String[] args) {
		
		//Wrapper Classes for Primitive Data Types:
		//byte == Byte
		//short == Short
		//int == Integer
		//long == Long
		//float == Float
		//double == Double
		//char == Character
		//boolean == Boolean
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);//0
		list.add(900);//1
		list.add(120);//2
		list.add(90);//3
		
		int size = list.size();
		System.out.println("Size of array list " + size);
		
		list.remove(1);//remove 1 element when using index
		
		System.out.println("Size after removing 1 element " + list.size());
		
		for(int index = 0 ; index < list.size() ; index ++) { 
			System.out.println("Index number" + index);
			System.out.println("Value is " + list.get(index));
		}
		
	}

}
