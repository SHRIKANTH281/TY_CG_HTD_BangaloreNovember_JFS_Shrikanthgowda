import java.util.LinkedList;

public class Linkedlist3 {
public static void main(String[] args) {
	LinkedList l1= new LinkedList<>();
	l1.add(12);
	l1.add(34);
	l1.add(78);
	l1.add(45);
	System.out.println(l1);
	System.out.println("---peek peekfirst peeklast------");
	System.out.println(l1.peek());
	System.out.println(l1.peekFirst());
	System.out.println(l1.peekLast());
	System.out.println("-----poll pollfirst polllast-----");
	l1.poll();
	System.out.println(l1);
	System.out.println(l1.pollFirst());
	System.out.println(l1);
	l1.pollLast();
	System.out.println(l1);
	LinkedList l2= new LinkedList<>();
	l2.add(12);
	l2.add(23);
	l2.add(90);
	l2.add(76);
	System.out.println("----offer offerlast offerfirst-----");
	System.out.println(l2.offer(8));
	System.out.println(l2.offerFirst(2));
	System.out.println(l2.offerLast(56));
	System.out.println(l2);
	
}
}
