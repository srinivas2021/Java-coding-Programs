package com.user.test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class IntergerArraySort {

	public static void main(String[] args) {

		List<Integer> list = List.of(4,2,1,5,3);
		

//		List<Integer> ltr =  list.stream()
//							.sorted(Comparator.comparingInt(Integer::intValue).reversed())
//							.collect(Collectors.toList());
		
		Optional<Integer> lt =  list.stream()
//								.sorted(Comparator.comparingInt(Integer::intValue).reversed())
								.sorted(Comparator.reverseOrder())
								.skip(1)
								.findFirst();
		
		System.out.println(lt); //second higest

	}

}
