package com.user.test;

import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args){

       Stream.iterate(new int[] {0, 1}, p -> new int[]{p[1], p[0] + p[1]})
                .limit(10)
                .mapToInt(p -> p[0])
                .forEach(System.out::println);
    }
}
