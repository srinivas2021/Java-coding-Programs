package com.user.test;

import java.util.Scanner;

public class PrintPrimes {
	
	static boolean isPrime(int n) {
		
		if(n <= 1)
		{
			return false;
		}
		for(int i=2; i < n; i++) {
			if(n % i == 0) 
				return false;
		}	
		return true;
}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
//		for(int i=1; i<=num; i++) {
//			if(isPrime(i)) {
//				System.out.println(i + " ");
//			}
//		}
		if(isPrime(num)) {
			System.out.println("it's a prime");
		}else {
			System.out.println("Not a prime");
		}
			
	}
}
