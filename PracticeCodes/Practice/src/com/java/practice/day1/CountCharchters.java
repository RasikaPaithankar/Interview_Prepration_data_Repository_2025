package com.java.practice.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharchters {

	public static void main(String[] args) {
		String s = "ChulbulPandey";
		UsingHashMap(s);
		System.out.println("===================================");
		UsingJava8(s);
	}

	private static void UsingJava8(String s) {
		Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));

		for(Entry<Character, Long> e : collect.entrySet()) {
			if(e.getValue() > 1) {
				System.out.println(e.getKey() + " " + e.getValue());
			}
		}
	}

	private static void UsingHashMap(String s) {
		char[] charArray = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = 0; i < charArray.length; i++) {
			if(!hm.containsKey(charArray[i])) {
				hm.put(charArray[i], 1);
			} else {
				hm.put(charArray[i], hm.get(charArray[i]) + 1);
			}
		}
		
		for(Entry<Character, Integer> e : hm.entrySet()) {
			if(e.getValue()> 1) {
			System.out.println(e.getKey() + " " + e.getValue());
			}
		}
	}

}
