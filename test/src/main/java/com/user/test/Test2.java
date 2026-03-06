package com.user.test;

import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args){
        List<String> list = List.of("srini","Vamsy","Rakesh");

        String result = list.stream()
                .reduce("", (a, b) -> a + " " + b
                );
        System.out.println(result);
    	
//    	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//    	int sum = numbers.stream().reduce(0, (a, b) -> a + b); // or Integer::sum
//    	System.out.println(sum);
    }
}
