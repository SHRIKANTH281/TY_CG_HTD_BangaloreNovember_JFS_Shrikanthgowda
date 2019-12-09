import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylist2 {
public static void main(String[] args) {
	ArrayList<String> a= new ArrayList<String>();
	a.add("shri");
	a.add(1, "ram");
	a.add("sam");
	a.add("krish");
	a.add("paj");
	System.out.println(a.size());
	System.out.println("---------------------------------");
	for (int i = 0; i < a.size(); i++) {
		System.out.println(a.get(i));
	}
	System.out.println("---------------------------------");
	for (String s : a) {
		System.out.println(s);
	}
	System.out.println("---------------------------------");
	Iterator<String> itr=a.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("----------------------------------");
	ListIterator<String> itr1=a.listIterator(a.size());
	while(itr1.hasPrevious()) {
		System.out.println(itr1.previous());
	}
	System.out.println("--------------------------------------");
	System.out.println(a.indexOf("sam"));
	a.remove(2);
	System.out.println(a);
	a.remove("krish");
	System.out.println(a);
	a.add("krish");
	a.add("shri");
	System.out.println(a.isEmpty());
	ArrayList<String> a1= new ArrayList<String>();
	a1.add("kohli");
	a1.add("dhoni");
	a1.add("rohit");
	a1.add("dhavan");
	a.addAll(a1);
	System.out.println(a);
	a1.containsAll(a);
	a1.add("rahul");
	System.out.println(a1);
	System.out.println(a1.lastIndexOf("rahul"));
	System.out.println(a.retainAll(a1));
	List<String> a2= a.subList(0, 2);
	System.out.println(a2);
}
}
