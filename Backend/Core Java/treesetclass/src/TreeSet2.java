import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
public static void main(String[] args) {
	TreeSet<Student> t= new TreeSet<Student>();
	t.add(new Student(45,"ram"));
	t.add(new Student(21,"shrii"));
	t.add(new Student(23, "praj"));
	t.add(new Student(21,"shrii"));
	Iterator<Student> s1= t.iterator();
	while(s1.hasNext()) {
		System.out.println(s1.next());
	}
	
}
}
