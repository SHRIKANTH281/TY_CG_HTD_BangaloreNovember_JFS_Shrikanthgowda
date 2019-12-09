package com.capgemini.map.treemap;

import java.util.Comparator;

public class StdName implements Comparator<Student> {

	

	@Override
	public int compare(Student o1, Student o2) {
		return o1.compareTo(o2);
	}

}
