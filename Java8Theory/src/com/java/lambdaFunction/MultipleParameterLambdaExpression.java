package com.java.lambdaFunction;

@FunctionalInterface
interface mutipleArguInterface {
	void m1(String a, Integer b, Character c);
}

public class MultipleParameterLambdaExpression {

	public static void main(String[] args) {
		mutipleArguInterface m = (a,b,c) -> {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		};
		m.m1("Lets learn Java", 8 , 'V');
	}
	

}
