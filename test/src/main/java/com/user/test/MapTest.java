package com.user.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapTest {

	public static void main(String[] args) {

		//it will allow multiple null values. It will not allow Duplicate keys, allow Duplicate values
//		Map<String, String> mp = new HashMap<>();
//		mp.put("S", "srini");
//		mp.put("R", null);
//		mp.put("k", null);
//		mp.put("M", "murali");
//		mp.put("N", "murali");
//		mp.put(null, "harsha");
		
		Map<String, String> mp = new TreeMap<>();
		mp.put("8", "srini");
		mp.put("5", "ram");
		mp.put("1", "harsha");
		mp.put("6", "murali");
		mp.put("3", null);
		mp.put("2", null);
				
		
//		mp.remove("M"); //remove particular object
//		mp.clear(); //remove all object
		
//		System.out.println(mp); // o/p: {null=harsha, R=null, S=srini, k=null, M=murali, N=murali}
		
		System.out.println(mp);  //TreeMap {1=harsha, 3=Anil, 5=ram, 6=murali, 8=srini}
		
		
		//Hashset it will not allow multiple null's & Duplicate values. it will allow only one null.
//Doesn't follow insertion order
		//LinkedHashSet follow insertion order
		//TreeSet: A set that stores unique elements in sorted order, 
//either by natural ordering or a specified comparator.
		
//		Set<Integer> s = new HashSet<Integer>();
//		s.add(null);
//		s.add(5);
//		s.add(9);
//		s.add(7);
//		s.add(null);
//		
//		s.clear(); //remove all elements
		
//		System.out.println(s);  // o/p: [null, 5, 9] 
		
//		List<String> list = new ArrayList<String>();
//		list.add("Srini");
//		list.add("Vamsy");
//		list.add("Kishore");
//		list.add("Harsha");
//		list.add("Harsha");
		
//		list.remove(2);
//		list.clear();

//		System.out.println(list);   // o/p: [Srini, Vamsy, Kishore, Harsha, Harsha]
	}

}
