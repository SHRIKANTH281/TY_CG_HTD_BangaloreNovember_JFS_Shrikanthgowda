package com.capgemini.map.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {
public static void main(String[] args) {
	ArrayList<Student> l1= new ArrayList<Student>();
	l1.add(new Student(10, "shree"));
	l1.add(new Student(11, "sam"));
	ArrayList<Student> l2= new ArrayList<Student>();
	l2.add(new Student(12, "ramesh"));
	l2.add(new Student(10, "suresh"));
	ArrayList<Student> l3= new ArrayList<Student>();
	l3.add(new Student(14, "dinesh"));
	l3.add(new Student(15, "ram"));
	TreeMap<String, ArrayList<Student>> t1= new TreeMap<String,ArrayList<Student>>();
	t1.put("1st Standard", l1);
	t1.put("2nd Standard", l2);
	t1.put("3rd Standard", l3);
	Set<Map.Entry<String, ArrayList<Student>>> s1=t1.entrySet();
	for (Map.Entry<String, ArrayList<Student>> e1 : s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println("-------------------------");
	}
}
}
