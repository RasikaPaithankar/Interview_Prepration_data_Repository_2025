package com.java.practice.day2;

public class SwapWithoutThirdVarible {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

}
