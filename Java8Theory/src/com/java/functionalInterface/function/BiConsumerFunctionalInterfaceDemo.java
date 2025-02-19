package com.java.functionalInterface.function;

import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterfaceDemo {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> bCons = (age , percentage) ->{
			if(age > 18 && percentage > 75) {
				System.out.println("You're eligible to participate in collage festival.");
			} else {
				System.out.println("The eligibility criteria is Age > 18 and Percentage > 75");
			}
		};
		bCons.accept(19, 89);
	}
}

