package com.user.test.exception;

public class A {
	
	public boolean flag;
	
	public void doSomeWork() {
		
		System.out.println("One");
		try {
			System.out.println("Two");
			if(flag == false) {
				throw new CustomException("Test");
			} else {
				throw new NullPointerException("Test2");
			}
//			System.out.println("Three");  //unreachable code
		} catch(CustomException e) {
			System.out.println("Four");
		} catch(Exception e1) {
			System.out.println("Five");
		} finally {
			System.out.println("Six");
		}
	}
	
	protected void finalize() throws Throwable {
		System.out.println("Seven");
	}

	public static void main(String[] args) {
		A a = new A();
		a.doSomeWork();
		a = null;
		System.gc();
	}
}
