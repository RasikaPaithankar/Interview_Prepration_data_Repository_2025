package com.java.functionalInterface.function;

import java.util.function.BinaryOperator;

public class BinaryOperatorFunctionInterfaceDemo {

	public static void main(String[] args) {
		BinaryOperator<Integer> res = (a,b) -> {
			return a*b;
		};
		System.out.println(res.apply(10, 2));
	}
}

