package com.week.ten.day.one;
import java.util.ArrayList;
public class ArrayListExample {
	
public static void main(String[] args) {
	ArrayList<Object> list = new ArrayList<>();//go with a specific type don't be lazy and use obj for everything
	
	list.add("Michelle");
	list.add(10);
	list.add(10.20);
	list.add(true);
	list.add(null);
	list.add("Michelle");
	
	for(Object obj : list) {
		System.out.println(obj);
		
	}
}
}
