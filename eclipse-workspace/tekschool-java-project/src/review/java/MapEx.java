package review.java;

import java.util.HashMap;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		// Keys are unique and unordered
		// Keys: based on the set
		// HashMap and TreeMap(Internally ordered internally in TM)
		// How to Clear a map: clear method (Interview question)
		// TreeMap sorts by keys
		
		HashMap<Integer , String> cityMap = new HashMap<>();
		
		cityMap.put(1, "Dallas");
		cityMap.put(2, "Arlington");
		cityMap.put(3, "Austin");
		cityMap.put(4, "Seattle");
		
		System.out.println(cityMap);
		Set<Integer> keys = cityMap.keySet();
		
		for (int id : keys) {
			System.out.println(id);
			System.out.println(cityMap.get(id));
		}
		cityMap.clear();
	}

}
