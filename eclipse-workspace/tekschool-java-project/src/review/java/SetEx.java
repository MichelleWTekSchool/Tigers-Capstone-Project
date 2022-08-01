package review.java;

import java.util.HashSet;
import java.util.TreeSet;

public class SetEx {
	public static void main(String[] args) {
		//Types of sets: HashSet, TreeSet, LinkedHashSet
		
		//HashSet<Integer> numbers = new HashSet<>();
		TreeSet<Integer> numbers = new TreeSet<>();
		
		//remove duplicates
		numbers.add(43);
		numbers.add(28);
		numbers.add(43);
		numbers.add(24);
		numbers.add(43);
		numbers.add(245);
		
		System.out.println("How many original numbers without duplicates: " + numbers.size());
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
