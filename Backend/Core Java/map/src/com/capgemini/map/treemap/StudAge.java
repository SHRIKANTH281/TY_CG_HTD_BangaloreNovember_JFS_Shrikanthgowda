package com.capgemini.map.treemap;

import java.util.Comparator;

public class StudAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.stdage > o2.stdage) {
			return 1;
		}else if(o1.stdage < o2.stdage) {
			return -1;
		}else
		return 0;	}

}
