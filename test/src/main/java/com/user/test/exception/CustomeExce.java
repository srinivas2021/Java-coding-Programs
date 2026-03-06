package com.user.test.exception;

public class CustomeExce {

	public static void main(String[] args) {
		 
	 try {
            validate(19);
         } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
         } 
	}
	
	public static void validate(int age) 
      throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age: " + age);
    }

}
