package com.user.test.intface;

public interface Calculation {

	public abstract void add(int a, int b);
	
	 default void sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
		
		display();
	}
	
	static void mul(int a, int b) {
		int c  = a * b;
		System.out.println(c);
	}
	
	private void display() {
		System.out.println("Srinivas");
	}
}
