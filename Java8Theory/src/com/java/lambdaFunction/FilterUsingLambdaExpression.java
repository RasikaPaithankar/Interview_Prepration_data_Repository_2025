package com.java.lambdaFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterUsingLambdaExpression {

	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1, "Kaju", "Biju"));
		empList.add(new Emp(2, "Gaju", "Biju"));
		empList.add(new Emp(3, "Raju", "Rujju"));
		
		empList.stream().filter(e -> e.id < 3).collect(Collectors.toList()).forEach(System.out::println);;
	}

}

class Empl {
	Integer id;
	String fName;
	String lName;

	public Empl(Integer id, String fName, String lName) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", fName=" + fName + ", lName=" + lName + "]";
	}
}