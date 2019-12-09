package com.capgemini.map.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap2 {
public static void main(String[] args) {
	StudAge s1= new StudAge();
	StdName s2 = new StdName();
	TreeMap<Student, String> t1= new TreeMap<Student,String>(s2);
	t1.put(new Student(21,"shree"), "1st standard");
	t1.put(new Student(24,"ram"), "8th standard");
	t1.put(new Student(23,"anu"), "2nd standard");
	Set<Map.Entry<Student, String>> s=t1.entrySet();
	for (Map.Entry<Student, String> e1 : s) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
	}
}
}
