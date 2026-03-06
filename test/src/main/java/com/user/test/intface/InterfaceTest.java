package com.user.test.intface;

public class InterfaceTest implements Calculation {

	@Override
	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

}
