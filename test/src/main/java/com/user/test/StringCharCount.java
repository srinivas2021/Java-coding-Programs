package com.user.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCharCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
	    String str = sc.nextLine();
		//String str = "aaabbbccddaae";

		charCount(str);
	}

	private static void charCount(String str) {
		Map<Character, Integer> hm = new HashMap<>();
	
		char[] chr = str.toCharArray();
	
		for (char c : chr) {
			if (hm.get(c) != null) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            System.out.println("'" + entry.getKey() + "' -> " + entry.getValue());
        }
	}
}