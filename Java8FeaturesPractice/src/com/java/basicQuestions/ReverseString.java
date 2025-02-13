package com.java.basicQuestions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        
        String reverse = Stream.of(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(reverse);
	}

}
