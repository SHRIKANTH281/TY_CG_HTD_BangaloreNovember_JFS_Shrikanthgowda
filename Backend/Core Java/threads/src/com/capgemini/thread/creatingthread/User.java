package com.capgemini.thread.creatingthread;

public class User extends Thread {
 PVR p;
 
public User(PVR p) {
	super();
	this.p = p;
}
@Override
	public void run() {

p.confirmTicket();
}
}
