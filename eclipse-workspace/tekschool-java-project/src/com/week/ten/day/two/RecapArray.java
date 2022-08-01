package com.week.ten.day.two;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class RecapArray {
	public static void main(String[] args) {
		
		//List interface
	List<String> cities = new LinkedList<>();
	cities.add("Austin");
	cities.add("Charlotte");
	
	int size = cities.size();
	
	cities.get(1);
		
	cities.remove(1);
	
	for(int i = 0 ; i < cities.size() ; i ++) {
		System.out.println(cities.get(i));
	}
	
	for (String city : cities) {
		System.out.println(city);
	}
	System.out.println(cities.isEmpty()); //True or false there is data in the list at this point
	
	cities.clear();//clears list
	System.out.println(cities.isEmpty());
		

}}
