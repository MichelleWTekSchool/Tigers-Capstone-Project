package review.java;
import java.util.ArrayList;
public class ArrayListEx {
public static void main(String[] args) {
	//int = Integer;
	//int is primitive
	//Integer is part of wrapper class?? double check on that
	
//	int a = 10;
//	
//	Integer number = 20; 
//	
//	double b = 12.32;
//	Double c = 12.32;
	
	ArrayList<String> list = new ArrayList<>();
	
	list.add("Rio"); //index starts at 0
	list.add("Dallas");
	list.add("Vienna");
	list.add("Charlotte");
	list.add("Austin");
	
	int size = list.size();
	System.out.println("Size of this array is " + size);
	
	//System.out.println(list.get(0)); //to get a # on array
	
	//do for loop to print list
	for (int i = 0 ; i <list.size() ; i ++) {
		System.out.println(list.get(i));
	}
	for (String value : list) {
		System.out.println(value);
	}
	//if (value.startswith("D")) {//finds starts with d
	//System.out.println(value);
}
}
