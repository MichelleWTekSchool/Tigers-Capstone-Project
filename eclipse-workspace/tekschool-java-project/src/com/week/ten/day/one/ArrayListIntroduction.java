package com.week.ten.day.one;
import java.util.ArrayList;
public class ArrayListIntroduction {
	
public static void main(String[] args) {
	
	//Instantiate an object of array list
	ArrayList<String> nameList = new ArrayList<>();//tags <> specify data type stored
	
	nameList.add("Michelle");//Add method to add value
	nameList.add("Pickles");
	nameList.add("Tumnus");
	nameList.add("Pickles");
	
	//Size method returns size of list
	//int listSize = nameList.size();
	
	//How long
	//System.out.println("This list size is " + listSize);
	
	//Index
	//System.out.println("Value in index 0 is " + nameList.get(0));
	
	//value at the end of the list of names
	//System.out.println("Last value in this array is " + nameList.get(listSize -1));
	
	//Prints order as it is added by the index
	//for (int i = 0 ; i < nameList.size() ; i ++);
	//	  String name = nameList.get(i);
	//		System.out.println(name);
	
	//unless you need to know the index or perform a task use this one
	for (String name : nameList) {
		System.out.println(name);
	}
	
	
}
}