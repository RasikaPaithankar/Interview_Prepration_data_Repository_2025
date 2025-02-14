package com.java.functionalInterface;

public class T {

	public static void main(String[] args) {
			ParentThreeInterface1 interface1 = () -> {
				System.out.println("Parent interface method");
			};
			interface1.m1();
			
			ChildThreeInterface1 interface2 = () -> {
				System.out.println("Child interface method");
			};
			interface2.m1();
			
			ParentThreeInterface1 interface3 = new ChildThreeInterface1() {
				
				@Override
				public void m1() {
					System.out.println("Parent reference - child object creation.");
				}
			};
			interface3.m1();

// 			same rule as class is applicable to interface that 
//			parent object can not use reference of the child.
//			ChildThreeInterface1 interface4 = new ParentThreeInterface1() {
//				@Override
//				public void m1() {
//				}
//			};
	}
}

@FunctionalInterface
interface ParentThreeInterface1 {
	void m1();
}

@FunctionalInterface
interface ChildThreeInterface1 extends ParentThreeInterface1{
	void m1();
}
