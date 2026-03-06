package com.user.test.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomClassSortingPersonTwo {

	public static void main(String[] args) {
		List<PersonTwo> peopletwo = new ArrayList<>(Arrays.asList(
                new PersonTwo("Alice", 30, 65.5),
                new PersonTwo("Bob", 25, 75.0),
                new PersonTwo("Charlie", 35, 20.0)
        ));
        System.out.println("Original people list: " + peopletwo);

        Collections.sort(peopletwo, new PersonTwo(null, 0, 0));
        System.out.println("Sorted people list: " + peopletwo);

	}

}
