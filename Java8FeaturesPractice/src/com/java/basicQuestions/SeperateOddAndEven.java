package com.java.basicQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SeperateOddAndEven {

	public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> collect = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i%2 == 0 ));

        for(Entry<Boolean, List<Integer>> e : collect.entrySet()) {
        	if(e.getKey() == true) {
        		System.out.println("Even keys are ");
        		System.out.print(e.getValue() + " ");
        	} else {
        		System.out.println("Odd keys are ");
        		System.out.print(e.getValue() + " ");
        		System.out.println();
        	}
        }
        
        
	}

}
