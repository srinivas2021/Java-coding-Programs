package com.user.test;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

	/*
	 * public static void main(String[] args) {
	 *  String str = "hello world";
	 * 	HashMap<Character, Integer> map = new HashMap<>();
	 * 
	 * 		for (char c : str.toCharArray()) {
	 *  		if (map.containsKey(c)) {
	 *   			map.put(c, map.get(c) + 1); 
	 *  		} else { 
	 *  			map.put(c, 1); 
	 * 			} 
	 *  	}
	 * 
	 * System.out.println("Character frequencies: " + map); }
	 */
	

	public static void main(String[] args) {
//        String str = "srinivas    isampalli";
//
//        Map<Character, Integer> freq = new HashMap<>();
//
//        for (char c : str.toCharArray()) {
//            if (c == ' ') continue; // ignore spaces only
//
//            freq.put(c, freq.getOrDefault(c, 0) + 1);
//        }
//
//        // Print frequencies
//        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
//            System.out.println("'" + entry.getKey() + "' -> " + entry.getValue());
//        }

		String str = "hello world java";
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c == ' ') continue;
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        freq.forEach((ch, count) -> System.out.println("'" + ch + "' -> " + count));

    }


}
