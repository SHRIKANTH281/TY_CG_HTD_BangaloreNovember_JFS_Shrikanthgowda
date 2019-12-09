import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist1 {
public static void main(String[] args) {
	ArrayList<Integer> a1 =new ArrayList<Integer>();
	a1.add(12);
	a1.add(15);
	a1.add(34);
	a1.add(45);
	//iteration using for loop
	for (int i = 0; i < a1.size(); i++) {
		System.out.println(a1.get(i));
	}
	System.out.println("------------------forEach-------------------");
	//iteration using forEach loop
	for (Integer i : a1) {
		System.out.println(i);
	}
	System.out.println("------------------iterator-------------------");
	Iterator<Integer> itr=a1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("------------------list iterator--------------------");
	ListIterator<Integer> itr1 = a1.listIterator(a1.size());
	while(itr1.hasPrevious()) {
		System.out.println(itr1.previous());
	}
}
}
