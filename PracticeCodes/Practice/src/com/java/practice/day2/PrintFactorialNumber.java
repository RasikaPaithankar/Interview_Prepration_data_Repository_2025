package com.java.practice.day2;

public class PrintFactorialNumber {

	public static void main(String[] args) {
		int a = 5;
		int r = 1;
		for(int i = 1; i<= a; i++) {
			r *= i;
		}
		System.out.println(r);
	}

}
