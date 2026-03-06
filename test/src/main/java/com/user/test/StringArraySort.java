package com.user.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringArraySort {

	public static void main(String[] args) {

		List<String> n = List.of("Geek", "GeeksQuiz", "g1", "QA", "Geek2");

        // declare the predicate type as string and use lambda expression to create object
        Predicate<String> p = (s) -> s.startsWith("G");

        // Iterate through the list
        for (String st : n) {
          
            // call the test method
            if (p.test(st))
                System.out.println(st);
        }
//	 	List<String> ls = n.stream().filter(s->s.startsWith("G")).collect(Collectors.toList());
//	 	System.out.println(ls);
    
	}
}
