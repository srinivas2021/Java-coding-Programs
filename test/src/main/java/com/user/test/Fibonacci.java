package com.user.test;

public class Fibonacci {
    public static void main(String[] args){
       feb(10);
    }
    static void feb(int N){
        int a = 0, b = 1;
        for(int i=0;i<N;i++){
        	
            System.out.print(a);
            
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
