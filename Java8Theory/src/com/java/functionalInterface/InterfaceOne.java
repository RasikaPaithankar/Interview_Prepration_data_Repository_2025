package com.java.functionalInterface;

@FunctionalInterface
public interface InterfaceOne {

	void m1();
	
	default void m2() {
		System.out.println("m2");
	}
	
	default void m3() {
		System.out.println("m3");
	}
	
	default void m4() {
		System.out.println("m4");
	}
	
	static void m5() {
		System.out.println("m5");
	}
}
