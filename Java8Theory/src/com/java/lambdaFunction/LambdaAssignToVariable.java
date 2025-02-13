package com.java.lambdaFunction;

@FunctionalInterface
interface MyCompartor{
	boolean compare(int a, int b);
}

public class LambdaAssignToVariable {

	public static void main(String[] args) {
		MyCompartor myCompartor = (a,b) -> {
			return (a > b);
		};
		
		boolean compare = myCompartor.compare(2, 5);
		System.out.println(compare);
	}
}
