package com.capgemini.map.hashmap;

public class Student {
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
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + stdage;
	result = prime * result + ((stdname == null) ? 0 : stdname.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (stdage != other.stdage)
		return false;
	if (stdname == null) {
		if (other.stdname != null)
			return false;
	} else if (!stdname.equals(other.stdname))
		return false;
	return true;
}

}
