package com.java.lambdaFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingLambdaFunction {

	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1, "Kaju", "Biju"));
		empList.add(new Emp(2, "Gaju", "Biju"));
		empList.add(new Emp(3, "Raju", "Rujju"));

		// sort based on fName
		Collections.sort(empList, (e1, e2) -> {
			return e1.fName.compareTo(e2.fName);
		});
		
		// reverse sort based on fName 
		Collections.sort(empList, (e1,e2) -> {
			return e2.fName.compareTo(e2.fName);
		});

		empList.forEach(e -> {
			System.out.println(e);
		});
	}
}

class Emp {
	Integer id;
	String fName;
	String lName;

	public Emp(Integer id, String fName, String lName) {
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