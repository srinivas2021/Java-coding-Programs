package com.user.test;

public class NumberToBinary {

	public static void main(String[] args) {

		int n = 10;
		
		String binaryStr = Integer.toBinaryString(n);
		String str = String.format("%4s", binaryStr).replace(' ', '0');
		
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println(str);
		
		System.out.println(sb.reverse());  //reverse the number
	}

}
