package com.companyname.access.pack2;

import com.companyname.access.pack1.Student;

public class TestStd extends Student {
	
 protected TestStd(String name) {
		super(name);
	}
 void details() {
	 System.out.println("Stendent nam is "+name);
 }

public static void main(String[] args) {
	TestStd s=new TestStd("shree");
	s.details();
	s.stdDetails();
	
}
}
