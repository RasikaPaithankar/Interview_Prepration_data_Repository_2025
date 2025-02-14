package com.java.functionalInterface;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		FuncIntDemo demo = new FuncIntDemo();
		demo.m3();
	}
}

@FunctionalInterface
interface A{
	void m1();
	
	static void m2() {
		System.out.println("A - Static method");
	}
}

@FunctionalInterface
interface B extends A{
	void m1();

//  can not override static method in interface too
//	@Override
	static void m2() {
		System.out.println("B - Static method");
	}
}

class Test {
	static void m3() {
		System.out.println("Test class - static method" );
	}
}

class FuncIntDemo extends Test{
	
//  can not override static method in class too.
//	@Override
	static void m3() {
		System.out.println("Test class - static method" );
	}
}

