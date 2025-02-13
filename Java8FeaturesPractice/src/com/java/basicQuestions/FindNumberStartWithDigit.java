package com.java.basicQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumberStartWithDigit {

	public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        List<String> collect = listOfStrings.stream().filter(i -> Character.isDigit(i.charAt(0))).collect(Collectors.toList());
        collect.forEach(i ->{
        	System.out.println(i);
        });
	}

}
