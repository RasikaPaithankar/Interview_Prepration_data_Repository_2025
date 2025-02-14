package com.java.functionalInterface;

public interface ParentTwoInterface {
	default void m1() {
		System.out.println("M1 - Parent default implemented.");
	}

	static void m2() {
		System.out.println("M2 - Parent static method implemented.");
	}
}

@FunctionalInterface
interface ChildTwoInterface extends ParentTwoInterface{
	
	void m3();
	
	default void m4() {
		System.out.println("M1 - Parent default implemented.");
	}

	static void m5() {
		System.out.println("M2 - Parent static method implemented.");
	}
}