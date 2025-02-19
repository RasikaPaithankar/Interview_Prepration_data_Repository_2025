package com.java.practice.day2;

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233

public class PrintFibonicciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = 1;
		
		System.out.print(a + ", " + b + ", " + c + ", ");
		
		for (int i = 0; i <= 10 ; i++) {
			a = b + c;
			b = c;
			c = a;
			System.out.print(a + ", ");
		}
	}

}
