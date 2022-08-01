package com.week.ten.day.one;
import java.util.LinkedList;
public class LinkedListIntro {
	
public static void main(String[] args) {
	
	//Instantiate and object Linkedlist
	LinkedList<String> list = new LinkedList<>();
	
	list.add("Michelle");//0
	list.add("Tumnus");//1
	list.add("Pickles");//2
	list.add("Clea");//3
	list.add("Keke");//4
	list.add("Nobody");//5
	
	String firstElement = list.getFirst();
	System.out.println("First Element " + firstElement);
	
	String lastElement = list.getLast();
	System.out.println("Last Element " + lastElement);
	
	System.out.println(list.get(3));
	System.out.println(list.get(2));
	
	System.out.println(list.size());
	
	list.remove(5);
	
	for(String name : list) {
		System.out.println(name);
		
}
}
}