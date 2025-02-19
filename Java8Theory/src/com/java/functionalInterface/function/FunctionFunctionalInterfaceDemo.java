package com.java.functionalInterface.function;

import java.util.HashMap;
import java.util.function.Function;

public class FunctionFunctionalInterfaceDemo {
	private static HashMap<Integer, String> Employee = new HashMap<>();

	public static void add(String name, int ID) {
		if (!Employee.containsKey(ID)) {
			Employee.put(ID, name);
		} else
			System.out.println("Employee already Registered");
	}

	public static void main(String[] args) {

		Function<Integer, String> get = (Integer id) -> {
			if (Employee.containsKey(id)) {
				return Employee.get(id);
			} else
				return "Invalid Id";
		};

		add("Tom Jones", 1045);
		add("Nancy Smith", 1065);
		add("Deborah Sprightly", 1029);
		add("Ethan Hardy", 1025);

		System.out.println("Emp 1065 Name is" + get.apply(1065));
	}
}
