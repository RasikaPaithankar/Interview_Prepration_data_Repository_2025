package com.java.basicQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfElementInAList {

	public static void main(String[] args) {
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");

		HashMap<String, Long> collect = (HashMap<String, Long>) stationeryList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		for (Entry<String, Long> entry : collect.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
