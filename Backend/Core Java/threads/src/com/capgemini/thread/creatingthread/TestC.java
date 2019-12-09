package com.capgemini.thread.creatingthread;

public class TestC {
	public static void main(String[] args) {
		System.out.println("main start");
		PVR p= new PVR();
		User u= new User(p);
		u.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		p.leaveme();
		System.out.println("main end");
	}
}
