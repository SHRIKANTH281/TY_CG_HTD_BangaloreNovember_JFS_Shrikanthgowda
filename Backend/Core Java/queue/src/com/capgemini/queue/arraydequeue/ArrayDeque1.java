package com.capgemini.queue.arraydequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {
public static void main(String[] args) {
	ArrayDeque<String> s1= new ArrayDeque<String>();
	s1.add("shri");
	s1.add("ram");
	s1.addFirst("praj");
	s1.addLast("sam");
	s1.add("shri");
	
	Iterator<String> itr=s1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println(s1.getFirst());
	s1.remove();
	System.out.println(s1);
	System.out.println(s1.peekLast());
	s1.pollFirst();
	System.out.println(s1);
	s1.offer("sam");
	s1.push("vishnu");
	System.out.println(s1);
	System.out.println(s1.element());
	s1.pop();
	System.out.println(s1);
	s1.removeLastOccurrence("sam");
	
	
}
}
