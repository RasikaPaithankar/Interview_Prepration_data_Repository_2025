package com.java.basicQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAccordingLengthOfStrings {

	public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<String> collect = listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        collect.forEach(i-> {
        	System.out.print(i + " , ");
        });
	}

}
