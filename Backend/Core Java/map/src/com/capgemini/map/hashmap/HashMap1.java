package com.capgemini.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
public static void main(String[] args) {
	HashMap<Integer, String> h1= new HashMap<Integer, String>();
	h1.put(2, "ramesh");
	h1.put(4, "ganesh");
	h1.put(6, "dinesh");
	h1.put(8, "suresh");
	Set<Map.Entry<Integer, String>> s1= h1.entrySet();
	for (Map.Entry<Integer, String> e1 : s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println("----------------------");
	}
}
}
