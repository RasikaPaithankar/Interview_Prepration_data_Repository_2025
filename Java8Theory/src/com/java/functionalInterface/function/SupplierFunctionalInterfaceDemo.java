package com.java.functionalInterface.function;

import java.util.function.Supplier;

// it does not take argument (input) but return the value

public class SupplierFunctionalInterfaceDemo {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			return "Its a Supplier Functional Interface";
		};
		
		System.out.println(s.get());
	}
}

