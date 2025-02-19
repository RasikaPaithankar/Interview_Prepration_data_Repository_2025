package com.java.functionalInterface.function;

import java.util.function.UnaryOperator;

public class UnaryOperatorFunctionInterfaceDemo {

	public static void main(String[] args) {
		UnaryOperator<Integer> un = (a) -> {
			Integer result = a / 10;
//			Type mismatch: cannot convert from String to Integer
// 		accept same return type as argument.			
//			return result.toString();
			return result;
		};
		System.out.println(un.apply(20));
	}
}


