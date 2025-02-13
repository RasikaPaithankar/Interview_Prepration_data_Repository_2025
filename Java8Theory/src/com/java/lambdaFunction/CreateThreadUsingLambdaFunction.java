package com.java.lambdaFunction;

public class CreateThreadUsingLambdaFunction {

	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("New Thread is created.");
		};
		Thread t = new Thread(r);
		t.start();
	}

}
