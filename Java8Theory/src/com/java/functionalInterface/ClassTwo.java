package com.java.functionalInterface;

@FunctionalInterface
interface interfaceTwo{
	void m1();
	
//  can have methods of object class, 
//	We can have any number of methods of object classes in our Functional Interface.
//  These object class methods don't have an implementation in the interface as well.	
	int hashCode();
	String toString();
// 	this method is not same as object class method so compiler will show an error message.	
//	boolean equals();
//  syntax of equals method is as below from object class.	
	boolean equals(Object o);
}

class AClass implements interfaceTwo{
	
	@Override
	public void m1() {
		System.out.println("M1 method implementation using class");
	}
}

public class ClassTwo {
	public static void main(String[] args) {
		AClass a = new AClass();
		a.m1();
	}
}
