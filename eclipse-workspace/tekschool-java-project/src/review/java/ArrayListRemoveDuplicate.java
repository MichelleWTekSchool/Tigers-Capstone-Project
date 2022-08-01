package review.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListRemoveDuplicate {
public static void main(String[] args) {
	//remove duplicates from array list
	
	ArrayList<String>originalList = new ArrayList<>();
	
	originalList.add("Rio"); //index starts at 0
	originalList.add("Dallas");
	originalList.add("Vienna");
	originalList.add("Charlotte");
	originalList.add("Austin");

	originalList.add("Rio"); //index starts at 0
	originalList.add("Dallas");
	originalList.add("Vienna");
	
	
//	//Simple way to resolve
//	Set<String> set = new HashSet<>(originalList);
//	
//	for (String value : set) {
//		System.out.println(value);
	
	//Complex way to resolve list
	List<String>listToKeep = new ArrayList<>();
	List<String>duplicateList = new ArrayList<>();
	
	int countOfDuplicate = 0;
	
	for(String value : originalList) {
		if (listToKeep.contains(value)){
			countOfDuplicate ++;
			duplicateList.add(value);
			
		}else {
			listToKeep.add(value);
		}
	}
	
	System.out.println("Number of duplicates " + countOfDuplicate);
	System.out.println(listToKeep);
	System.out.println("Duplicates removed " + duplicateList);
			
		}
}