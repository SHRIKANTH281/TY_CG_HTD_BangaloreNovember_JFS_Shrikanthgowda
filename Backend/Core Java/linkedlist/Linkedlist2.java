import java.util.LinkedList;

public class Linkedlist2 {
public static void main(String[] args) {
	LinkedList l1 = new LinkedList<>();
	l1.add(12);
	l1.add(45);
	l1.add(34);
	System.out.println(l1);
	l1.addFirst(56);
	l1.addLast(88);
	System.out.println(l1);
	System.out.println("-----remove()----------");
	l1.removeFirst();
	l1.removeLast();
	System.out.println("------------------------");
	LinkedList l2 = new LinkedList<>();
	l2.add(24);
	l2.add(45);
	l2.add(12);
	l2.add(45);
	l2.add(45);
	l2.add(86);
	System.out.println(l2);
	System.out.println("---remove first occurance-----");
	l2.removeFirstOccurrence(45);
	System.out.println(l2);
	System.out.println("----remove last occurance-----");
	l2.removeLastOccurrence(45);
	System.out.println(l2);
	System.out.println("----get last and get first-----");
	System.out.println(l2.getFirst());
	System.out.println(l2.getLast());
}
}
