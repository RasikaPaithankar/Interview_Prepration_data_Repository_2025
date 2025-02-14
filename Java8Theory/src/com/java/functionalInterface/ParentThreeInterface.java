package com.java.functionalInterface;

@FunctionalInterface
public interface ParentThreeInterface {

	void m1();
}

@FunctionalInterface
interface ChildThreeInterface extends ParentThreeInterface{
	void m1();
}
