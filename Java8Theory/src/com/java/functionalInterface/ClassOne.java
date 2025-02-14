package com.java.functionalInterface;

public class ClassOne {

	public static void main(String[] args) {

		FuncInterfaceOne one = () -> {
			System.out.println("M1 method implementation using Lambda Expression");
		};
		one.m1();
	}
}

@FunctionalInterface
interface FuncInterfaceOne {

	void m1();
}

