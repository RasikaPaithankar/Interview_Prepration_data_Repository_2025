package com.java.lambdaFunction;

@FunctionalInterface
interface MyLocalInterface{
	public void m1();
}

@FunctionalInterface
interface ALocalInterface {
	public void m1(String s);
}

public class LocalVariablesInLambdaFunction {

	public static void main(String[] args) {

		String s = "Hello";
		// we can use local variable inside lambda function. 
		// To use local variable in lambda function, there are some rules have to follow
		MyLocalInterface myLocalInterface = () -> {
			System.out.println(s + " Java.");
		};
		myLocalInterface.m1();
		
		// Rule 1
		// we can not use same name of outside local variable, 
		// since a lambda expression can't define any new scope as an anonymous inner class does.
		// here str is another String variable 
		// can not use s as a name as local variable name is s.
		ALocalInterface aLocalInterface = (str) -> {
			System.out.println(s + str);
		};
		aLocalInterface.m1(" C++.");
		
		// Rule 2
		// if we have assign a value to local variable, 
		// we can not assign new value to local variable inside lambda function.
		// because local variable may be final.
		
		String s1 = "Cloud";
		ALocalInterface localInterface = (str) -> {
//		Its throwing an compile time error as below
//		"Local variable s1 defined in an enclosing scope must be final or effectively final"
//			s1 = "Spring";
		};
		
		// Rule 3
		// super and this are the same in lambda function.
		// Because lambda expressions can't define any new scope.
	}
}
