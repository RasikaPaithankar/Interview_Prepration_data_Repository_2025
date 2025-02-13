package com.java.lambdaFunction;

@FunctionalInterface
interface AFunctionalInter {
	void m1();
}

public class WithoutLambdaExpression {

	public static void main(String[] args) {

		AFunctionalInter aF = new AFunctionalInter() {
			
			@Override
			public void m1() {
				System.out.println("Without using lambda expression.");
			}
		};
		
		aF.m1();
	}

}

	