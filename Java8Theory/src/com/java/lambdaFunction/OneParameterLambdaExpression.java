package com.java.lambdaFunction;

@FunctionalInterface
interface oneArgumentFunctionalInterface {
	void m1(String s);
}

public class OneParameterLambdaExpression {

	public static void main(String[] args) {
		oneArgumentFunctionalInterface a = (p1) -> {
			System.out.println(p1);
		};
		a.m1("Java is powerful language");
	}

}
