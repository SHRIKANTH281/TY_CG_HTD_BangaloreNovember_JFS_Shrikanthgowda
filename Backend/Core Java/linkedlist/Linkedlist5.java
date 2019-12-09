import java.util.LinkedList;

public class Linkedlist5 {
 public static void main(String[] args) {
	LinkedList<String> l1= new LinkedList<String>();
	l1.add("shri");
	l1.add(1, "ram");
	l1.addFirst("anu");
	l1.addLast("sam");
	System.out.println(l1);
	l1.push(null);
	l1.peek();
	System.out.println(l1);
	System.out.println(l1.element());
	System.out.println(l1.size());
}
}
