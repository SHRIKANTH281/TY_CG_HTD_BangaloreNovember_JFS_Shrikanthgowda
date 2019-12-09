package com.capgemini.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {
public static void main(String[] args) {
	HashMap<Integer, Student> h1= new HashMap<Integer, Student>();
	h1.put(34, new Student(22,"divya"));
	h1.put(22, new Student(23,"ramesh"));
	h1.put(null, null);
	h1.put(34, new Student(22,"divya"));
	Collection<Student> c1= h1.values();
	for (Student s1 : c1) {
		System.out.println(s1);
	}
	Set<Integer> s=h1.keySet();
	for (Integer i1 : s) {
		System.out.println(i1);
	}
	System.out.println(h1.containsKey(34));
	System.out.println(h1.containsValue(new Student(22, "divya")));
	System.out.println(h1.size());
	System.out.println(h1.isEmpty());
}
}
