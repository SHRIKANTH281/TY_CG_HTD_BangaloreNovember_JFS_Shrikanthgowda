package com.capgemini.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap2 {
public static void main(String[] args) {
	LinkedHashMap<Integer, Employee> l1= new LinkedHashMap<Integer, Employee>();
	l1.put(34, new Employee(23000, "divya"));
	l1.put(56, new Employee(13000, "ramesh"));
	l1.put(89, new Employee(26000, "shree"));
	System.out.println(l1.get(34));
	Set<Map.Entry<Integer, Employee>> s1= l1.entrySet();
	for (Map.Entry<Integer, Employee> e1 : s1) {
		System.out.println(e1);
	}
	System.out.println(l1.containsKey(56));
	System.out.println(l1.containsValue(new Employee(26000,"shree")));
	System.out.println(l1.size());
	System.out.println(l1.isEmpty());
	
}
}
