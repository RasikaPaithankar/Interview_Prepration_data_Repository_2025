package com.java.basicQuestions;

import java.util.stream.IntStream;

public class PrintEvenNumber {

	public static void main(String[] args) {

		IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
		
		System.out.println("===================================");
		
		IntStream.rangeClosed(1, 10).filter(i -> i % 2 == 0).forEach(System.out::println);
	}

}
