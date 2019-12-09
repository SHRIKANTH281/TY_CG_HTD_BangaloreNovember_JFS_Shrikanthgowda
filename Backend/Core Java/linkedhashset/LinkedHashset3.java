import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset3 {
public static void main(String[] args) {
	LinkedHashSet<Employee> l1= new LinkedHashSet<Employee>();
	l1.add(new Employee(22,"shri"));
	l1.add(new Employee(23,"ram"));
	l1.add(new Employee(22,"shri"));
	Iterator<Employee> itr= l1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
