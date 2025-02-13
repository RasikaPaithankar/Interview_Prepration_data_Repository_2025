package com.java.practice.day1;

import java.util.HashMap;

public class CountWords {

	public static void main(String[] args) {
		String s = "I am a java developer and I am proud of it";
		
		String[] split = s.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for (int i = 0; i < split.length; i++) {
			if(!hm.containsKey(split[i].toUpperCase())) {
				hm.put(split[i].toUpperCase(), 1);
			} else {
				hm.put(split[i].toUpperCase(), hm.get(split[i].toUpperCase()) + 1);
			}
		}

		hm.entrySet().forEach( e -> {
			if(e.getValue() > 1) {
				System.out.println(e.getKey() + "  " + e.getValue());
			}
		});
	}

}
