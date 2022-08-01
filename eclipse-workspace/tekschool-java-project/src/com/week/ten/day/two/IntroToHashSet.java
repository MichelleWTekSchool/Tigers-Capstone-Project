package com.week.ten.day.two;
import java.util.HashSet;
public class IntroToHashSet {
	
	public static void main(String[] args) {
				
		//Instantiate an object of HashSet
		HashSet<String> set = new HashSet<>();
		
		//Not based on an index; list will not be in order of original listing
		//Ordering internally
		set.add("Michelle");
		set.add("Tumnus");
		set.add("Pickles");
		set.add("Clea");
		set.add("Keke");
		set.add("Michelle");//does not increase size with a duplicate; does not except duplicate values
	
		System.out.println(set.size());
		
		for(String name : set) {
			System.out.println(name);
		}
	boolean isEmpty = set.isEmpty();//is this map empty; if so add values
	
	set.remove("Michelle");
	System.out.println(set.size());
	
	}

}
