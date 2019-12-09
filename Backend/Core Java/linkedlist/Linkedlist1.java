import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist1 {
public static void main(String[] args) {
	LinkedList l1 = new LinkedList<>();
	l1.add(12);
	l1.add(32);
	l1.add(3);
	System.out.println(l1);
	l1.add(12);
	ListIterator itr=l1.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	l1.remove(new Integer(12));
	System.out.println(l1);
	l1.add(null);
	System.out.println(l1);
	System.out.println("-------------------for each----------------");
	for (Object i1 : l1) {
		System.out.println(i1);
	}
	System.out.println("-----------foe loop-------------------");
	for (int i = 0; i < l1.size(); i++) {
		System.out.println(l1.get(i));
	}
}
}
