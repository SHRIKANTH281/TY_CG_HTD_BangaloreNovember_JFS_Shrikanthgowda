package com.capgemini.thread.creatingthread;

public class TestA {
public static void main(String[] args) {
	System.out.println("main start");
	Thread1 t1= new Thread1();
	t1.start();
	System.out.println("main end");
}
}
