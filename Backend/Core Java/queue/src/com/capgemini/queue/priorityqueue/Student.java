package com.capgemini.queue.priorityqueue;

public class Student implements Comparable<Student> {
int stdage;
String stdname;
public Student(int stdage, String stdname) {
	super();
	this.stdage = stdage;
	this.stdname = stdname;
}
@Override
public String toString() {
	return "Student [stdage=" + stdage + ", stdname=" + stdname + "]";
}
@Override
public int compareTo(Student o) {
	return 1;
}

}
