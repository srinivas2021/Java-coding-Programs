package com.user.test.intface;

public class IntMainTest {

	public static void main(String[] args) {

		InterfaceTest t = new InterfaceTest();
		t.add(5, 8);
		
		Calculation cal = t;
		cal.sub(12, 4);
				
		Calculation.mul(3, 6);
	}
}
