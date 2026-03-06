package com.user.test;

public class PrintStars {

	public static void main(String[] args) {

		int n = 5;
		printStarsPat(n);
	}

	static void printStarsPat(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
