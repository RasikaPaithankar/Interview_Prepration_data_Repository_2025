package com.java.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterfaceDemo {

	public static void main(String[] args) {		
		Predicate<String> checkLength = (s -> s.length() > 8);
        System.out.println("Functional Interfaces having length 8 are:-");
        List<String> FunctionalInterfaces = Arrays.asList("Predicate",
        									"Function", "Consumer", "Supplier");
        FunctionalInterfaces.forEach(x -> {
        	if(checkLength.test(x)) {
        		System.out.println(x);
        	}
        });
	}
}

