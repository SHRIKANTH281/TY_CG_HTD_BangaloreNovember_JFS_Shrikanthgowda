package com.companyname.access.pack1;

public class Person {
 public static int age=21;
 public String name;
 public Person(String name) {
	 this.name=name;
 }
 public void personDetails() {
	 System.out.println("Name is "+name);
 }
 public static void details() {
	 System.out.println("age is "+age);
 }
}
