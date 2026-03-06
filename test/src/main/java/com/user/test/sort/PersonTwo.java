package com.user.test.sort;

import java.util.Comparator;

public class PersonTwo implements Comparator<PersonTwo> {
	
	String name;
    int age;
    double weight;

    public PersonTwo(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", weight=" + weight + " kgs]";
    }

    @Override
    public int compare(PersonTwo p1, PersonTwo p2) {
        return p1.age - p2.age;
    }

}
