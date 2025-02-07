package com.java.basicQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMinimumNumber {

	public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        usingMinFunction(listOfIntegers);
        System.out.println("================================");
        usingSortFunction(listOfIntegers);
	}

	private static void usingSortFunction(List<Integer> listOfIntegers) {
		Integer integer = listOfIntegers.stream().sorted(Comparator.naturalOrder()).findFirst().get();
        System.out.println(integer);

	}

	private static void usingMinFunction(List<Integer> listOfIntegers) {
		Integer integer = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(integer);
	}

}
