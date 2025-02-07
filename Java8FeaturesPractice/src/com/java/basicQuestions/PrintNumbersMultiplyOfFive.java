package com.java.basicQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNumbersMultiplyOfFive {

	public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> collect = listOfIntegers.stream().filter(i -> i%5 == 0).collect(Collectors.toList());
        
        collect.forEach(i-> {
        	System.out.println(" numbers are " + i);
        });
	}

}
