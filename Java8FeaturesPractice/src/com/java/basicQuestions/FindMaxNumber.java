package com.java.basicQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxNumber {

	public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        usingSortFunction(listOfIntegers);
        System.out.println("===========================================");
        usingMaxFunction(listOfIntegers);
	}

	private static void usingMaxFunction(List<Integer> listOfIntegers) {
		Integer integer = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println(integer);
	}

	private static void usingSortFunction(List<Integer> listOfIntegers) {
		Integer integer = listOfIntegers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(integer);
	}

}
