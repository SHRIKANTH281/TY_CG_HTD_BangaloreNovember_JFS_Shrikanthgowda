package com.capgemini.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue2 {
public static void main(String[] args) {
	PriorityQueue<Student> s= new PriorityQueue<Student>();
	s.offer(new Student(22, "shri"));
	s.offer(new Student(23, "ram"));
	s.offer(new Student(22, "shri"));
	for (Student s1 : s) {
		System.out.println(s1);
	}
}
}
