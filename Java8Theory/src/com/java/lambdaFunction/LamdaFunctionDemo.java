package com.java.lambdaFunction;

@FunctionalInterface
interface AFunInterface {

	public void test();
}

@FunctionalInterface
interface BFunInterface {
	public void test(Character a, String b, String c);
}

public class LamdaFunctionDemo {

	public static void main(String[] args) 
	{
		AFunInterface a = () -> {
			System.out.println("Using Lambda Expression.");
		};
		a.test();
		
		BFunInterface bf = (x, y, z) -> {
			System.out.println(x + " " + y + " " + z);
		};
		
		bf.test('I', "Love", "Kaju");
	}
}

