package com.capgemini.map.linkedhashmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> l1= new LinkedHashMap<String, Integer>();
	l1.put("BTM", 567002);
	l1.put("Rajajinagar", 567458);
	l1.put("BTR", 670658);
	l1.remove("BTR");
	l1.put(null, 567456);
	Collection<Integer> i1=l1.values();
	for (Integer i : i1) {
		System.out.println(i);
	}
	System.out.println("------------------------------");
	Set<String> s=l1.keySet();
	for (String s1 : s) {
		System.out.println(s1);
	}
	System.out.println("-------------------------------");
	Set<Map.Entry<String,Integer>> s1= l1.entrySet();
	for (Map.Entry<String, Integer> e1 : s1) {
		System.out.println(e1);
	}
	System.out.println(l1.size());
	System.out.println(l1.isEmpty());
	System.out.println(l1.containsKey("BTR"));
}
}
