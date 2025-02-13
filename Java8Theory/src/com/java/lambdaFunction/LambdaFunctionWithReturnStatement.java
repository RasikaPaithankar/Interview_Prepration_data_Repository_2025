package com.java.lambdaFunction;

@FunctionalInterface
interface ReturnInterface {
	public String m1();
}

public class LambdaFunctionWithReturnStatement {

	public static void main(String[] args) {

		ReturnInterface r = () -> {
			return "Wow, return statement works";
		};
		System.out.println(r.m1());
	}
}
