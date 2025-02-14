package com.java.lambdaFunction;

public class StaticVariableInLambdaExpression {

	static int i = 0;
	public static void main(String[] args) {
		Runnable runnable = () -> {
			i = 10;
			System.out.println("Running new thread with static variable " + i);
		};
		
		Thread t = new Thread(runnable);
		t.start();
		
	}

}
