package com.java.basicQuestions;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CalculateFrequencyOfCharacters {

	public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        Map<Character, Long> collect = inputString.
        								chars().mapToObj(c -> (char) c).
        								collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    
        for(Entry<Character, Long> e : collect.entrySet()) {
        	System.out.println(e.getKey() + " = " + e.getValue());
        }        
	}
}
