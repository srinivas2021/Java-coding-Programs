package com.user.test;

import java.util.SplittableRandom;

public class RandomNumber {

	public static void main(String[] args) {
		SplittableRandom random = new SplittableRandom();
		int randomNumberInRange = random.nextInt(1000, 9999);
		System.out.println(randomNumberInRange);
		
//		double a = 0.1;
//		double b = 0.2;
//		double c = a + b;
//		System.out.println(c);

	}

}
