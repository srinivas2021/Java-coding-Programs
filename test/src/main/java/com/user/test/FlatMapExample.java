package com.user.test;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

	public static void main( String[] args )
    {
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4));
        
        //flatMap is used for one-to-many
        //map is used for one-to-one transformations
        numbers.stream().flatMap(list -> list.stream())
        		        .forEach(System.out::println);
    }
}
