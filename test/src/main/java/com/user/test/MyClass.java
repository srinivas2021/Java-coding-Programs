package com.user.test;

import java.util.Arrays;import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyClass {

	public static void main(String[] args) {
//		List<Integer> list = List.of(2,9,3,2,4,7,9);
//		
//		List<Integer> str = list.stream()
//								.distinct()
//								.sorted()
//								.collect(Collectors.toList());
//		System.out.println(str);
		
		List<String> list = Arrays.asList("a", "b", "a", "c", "b", "d", "a");
		
//		List<String> duplicates = list.stream()
//										.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//										.entrySet().stream()
//										.filter(e->e.getValue() > 1)
//										.map(Map.Entry::getKey)
//										.collect(Collectors.toList());

	Map<String, Long> counts = list.stream()
								.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	//System.out.println(counts);

	Map<String, Long> duplicatedWithCounts = counts.entrySet().stream()
												.filter(e -> e.getValue() > 1)
												.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

	System.out.println(duplicatedWithCounts); // {a=3, b=2}

		
		//System.out.println(duplicates);
		
	}

}
