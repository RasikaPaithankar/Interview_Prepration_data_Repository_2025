package com.java.basicQuestions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfDigit {

	public static void main(String[] args) {
		Integer i = 124434;
		
		Integer collect = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(collect);
	}

}
