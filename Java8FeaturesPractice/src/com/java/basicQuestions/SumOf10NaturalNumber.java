package com.java.basicQuestions;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOf10NaturalNumber {

	public static void main(String[] args) {
		int sum = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum);
		System.out.println("============================");

		
		Integer sum1 = Stream.iterate(1, n -> n+1).limit(10).reduce(0, Integer::sum);
		System.out.println(sum1);
		System.out.println("============================");
		
		int sum2 = IntStream.range(1, 11).sum();
		System.out.println(sum2);
		System.out.println("============================");

	}

}
