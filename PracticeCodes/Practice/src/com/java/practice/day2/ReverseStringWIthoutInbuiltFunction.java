package com.java.practice.day2;

public class ReverseStringWIthoutInbuiltFunction {

	public static void main(String[] args) {
		String s = "Lets Reverse me.";
		
			
		approachOne(s);
		System.out.println();
		approachTwo(s);
		System.out.println();
		approachThree(s);
		
	}
	
	private static void approachOne(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		System.out.print(sb);
	}
	
	private static void approachTwo(String s) {
		for(int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
	
	private static void approachThree(String s) {
		String r = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			r += s.charAt(i);
		}
		System.out.print(r);
	}

}
