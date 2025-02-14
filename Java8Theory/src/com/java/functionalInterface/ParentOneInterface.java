package com.java.functionalInterface;

public interface ParentOneInterface {
	default void m1() {
		System.out.println("M1 - Parent default implemented.");
	}

	static void m2() {
		System.out.println("M2 - Parent static method implemented.");
	}

	void m3();
}

@FunctionalInterface
interface ChildOneInterface extends ParentOneInterface {

	default void m4() {
		System.out.println("M1 - Child default implemented.");
	}

	static void m5() {
		System.out.println("M2 - Child static method implemented.");
	}
}