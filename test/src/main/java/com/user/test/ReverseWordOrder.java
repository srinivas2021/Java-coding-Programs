package com.user.test;
import java.util.*;
import java.util.stream.*;

public class ReverseWordOrder {
    public static String reverseWordOrder(String s) {
        if (s == null) return null;

        // Split on whitespace, filter out empties (handles multiple spaces/tabs/newlines)
        List<String> words = Arrays.stream(s.trim().split("\\s+"))
                                   .collect(Collectors.toList());

        Collections.reverse(words);
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(reverseWordOrder("Hello   world\tfrom  Java")); // Java from world Hello
        System.out.println(reverseWordOrder("  one "));                    // one
        System.out.println(reverseWordOrder(""));                          // (empty string)
    }
}

