package com.capgemini.thread.creatingthread;

public class IRCTC {
	synchronized void confirmTicket() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
	}
	synchronized void leaveme() {
		System.out.println("notify called");
		notifyAll();
	}
}
