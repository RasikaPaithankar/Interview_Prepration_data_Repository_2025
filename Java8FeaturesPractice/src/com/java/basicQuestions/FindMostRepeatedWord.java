package com.java.basicQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostRepeatedWord {

	public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "pencil", "Pencil", "Note Book", "Pencil");

        Map<String, Long> collect = listOfStrings.stream().map(String::toUpperCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Entry<String, Long> str = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        
        System.out.println(str.getKey());
        System.out.println(str.getValue());
	}

}
