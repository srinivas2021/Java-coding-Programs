package com.user.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToChar {

	public static void main(String[] args) {
//		List<String> list = Arrays.asList("Srini", "Uday", "Chaitu");
//		
//		list.stream().flatMap(str -> str.chars().mapToObj(c->(char)c))
//				     .forEach(System.out::println);
		/*
		 * String str = "Srinivas";
		 * 
		 * char[] ch = str.toCharArray(); System.out.println(Arrays.toString(ch));
		 */
		
		/*
		 * String s = "Geeks"; String r = "";
		 * 
		 * for (int i = 0; i < s.length(); i++){
		 * 
		 * // prepend each character r = s.charAt(i) + r; } System.out.println(r);
		 */
		
		
		
		/* String input = "Java streams offer a functional approach";
		 * 
		 * Stream<String> wordStream = Arrays.stream(input.split(delimiter));
		 * 
		 * wordStream.forEach(System.out::println);
		 */
		
			String input = "Java streams offer a functional approach"; 
		
		    List<String> words = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
		    Collections.reverse(words);
		  
		    String s = String.join(" ", words);
			  
		    System.out.println(s);
		
	}

}
