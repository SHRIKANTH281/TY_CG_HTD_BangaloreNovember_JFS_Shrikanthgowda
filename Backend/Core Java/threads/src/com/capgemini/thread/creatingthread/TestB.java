package com.capgemini.thread.creatingthread;

public class TestB {
public static void main(String[] args) {
	System.out.println("Main start");
	Thread2 t1= new Thread2();
	Thread t2= new Thread(t1);
	t2.start();
	System.out.println("main end");
}
}
