package com.java.basicQuestions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckIsStringAnagram {

	public static void main(String[] args) {
		String s1 = "RaceCar";
        String s2 = "CarRace ";
        
        String collect = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String collect2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        
        if(collect.equals(collect2)) {
        	System.out.println("String is anagram.");
        } else {
        	System.out.println("String is not anagram.");
        }
	}

}
