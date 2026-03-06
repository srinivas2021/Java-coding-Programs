package com.user.test;

public class SumOfDigits {

	public static void main(String[] args) {

		int a = 4832;
		int sum =0;
		
		while(a>0) {
			int b = a%10;
			a = a/10;
			sum = sum + b;
		}
		System.out.println(sum);
		
		
//		int [] b = String.valueOf(a).chars().map(c->c -'0').toArray();
//		int d = 0;
//		
//		for (int i : b) {
//			d = d+i;
//		}
//		System.out.println(d);
	}

}
