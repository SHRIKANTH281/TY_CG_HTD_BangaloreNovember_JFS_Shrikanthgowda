package com.capgemini.thread.creatingthread;

public class TestD {
public static void main(String[] args) {
	System.out.println("main start");
	IRCTC i= new IRCTC();
	User1 u =new User1(i);
   	User1 u1= new User1(i);
	u1.start();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	i.leaveme();
	System.out.println("main end");
}
}
