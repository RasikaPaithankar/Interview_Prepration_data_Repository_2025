package com.java.functionalInterface.function;

import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceDemo {

	public static void main(String[] args) {
		Consumer<String> c = (s) -> {
			System.out.println(s);
		};
		c.accept("Java is also support functional programming");
	}
}
