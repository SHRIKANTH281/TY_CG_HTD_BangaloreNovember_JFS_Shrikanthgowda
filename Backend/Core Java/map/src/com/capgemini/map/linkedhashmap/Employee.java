package com.capgemini.map.linkedhashmap;

public class Employee {
int salary;
String name;
public Employee(int salary, String name) {
	super();
	this.salary = salary;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [salary=" + salary + ", name=" + name + "]";
}

}
