import java.util.ArrayList;
import java.util.List;

public class List1 {
public static void main(String[] args) {
	List l1= new ArrayList<>();
	l1.add(0 , 12);
	l1.add(1, 13);
	l1.add(2, 15);
	l1.add(3, 45);
	l1.add(2, 100);
	System.out.println(l1);
	l1.remove(2);
	System.out.println(l1);
	l1.indexOf(3);
	l1.add(1000);
	System.out.println(l1.lastIndexOf(1000));
	for (int i = 0; i < l1.size(); i++) {
		System.out.println(l1.get(i));
	}
	System.out.println("-----------------------");
	List l2= new ArrayList<>();
	l2.add(0 , 12);
	l2.add(1, 13);
	l2.add(2, 15);
	l2.add(20);
	System.out.println(l2);
	l2.set(2, 28);
	System.out.println(l2);
	System.out.println("-----------------------");
	List l4= new ArrayList<>();
	l4.add(0 , 12);
	l4.add(1, 13);
	l4.add(22);
	System.out.println(l4.addAll(1, l2));
	System.out.println("-----------");
	List l3=l2.subList(0, 2);
	System.out.println(l3);
}
}
