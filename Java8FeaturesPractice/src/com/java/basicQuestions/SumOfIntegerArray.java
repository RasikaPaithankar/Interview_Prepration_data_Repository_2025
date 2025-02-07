package com.java.basicQuestions;

import java.util.Arrays;

public class SumOfIntegerArray {

	public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        
        int sum = Arrays.stream(a).sum();
        System.out.println(sum);
        
        System.out.println("=======================================");
        
        Integer sum1 = Arrays.stream(a).mapToObj(Integer::valueOf).reduce(0, (x,y) -> x+y);
        System.out.println(sum1);
	}

}
