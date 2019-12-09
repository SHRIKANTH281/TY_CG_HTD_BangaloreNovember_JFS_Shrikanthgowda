import java.util.LinkedList;

public class Linkedlist4 {
public static void main(String[] args) {
	LinkedList l1= new LinkedList<>();
	l1.add(56);
	l1.add(23);
	l1.add(34);
	System.out.println(l1);
	System.out.println("---push pop element----");
	l1.push(28);
	System.out.println(l1);
	l1.poll();
	System.out.println(l1);
	System.out.println(l1.element());
}
}
