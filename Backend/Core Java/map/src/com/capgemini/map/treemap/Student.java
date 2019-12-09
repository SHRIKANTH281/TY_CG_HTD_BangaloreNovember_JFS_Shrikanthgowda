package com.capgemini.map.treemap;

public class Student implements Comparable<Student> {
int stdage;
String stdname;
public Student(int stdage, String stdname) {
	super();
	this.stdage = stdage;
	this.stdname = stdname;
}
@Override
public int compareTo(Student o) {
	if(this.stdage > o.stdage) {
		return 1;
	}else if(this.stdage < o.stdage) {
		return -1;
	}else
	return 0;
}
@Override
public String toString() {
	return "Student [stdage=" + stdage + ", stdname=" + stdname + "]";
}

}
