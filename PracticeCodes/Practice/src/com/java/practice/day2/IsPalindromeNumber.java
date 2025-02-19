package com.java.practice.day2;

public class IsPalindromeNumber {

	public static void main(String[] args) {
		int i = 12355321;
		int num = i;
		int r = 0;
		int reverseNum = 0;
		while(num != 0) {
			r = num % 10;
			reverseNum = reverseNum * 10 + r;
			num /= 10;
		}
		
		if(i == reverseNum) {
			System.out.println("Its palindrome.");
		} else {
			System.out.println("Its not palindrome.");
		}
	}

}
