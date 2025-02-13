package com.java.lambdaFunction;

@FunctionalInterface
interface XFunctionalInterface {
	void m1();
}

public class UsingLambdaExpression {

	public static void main(String[] args) {

		XFunctionalInterface x = () -> {
			System.out.println("Using lambda expression.");
		};
		x.m1();
	}

}
