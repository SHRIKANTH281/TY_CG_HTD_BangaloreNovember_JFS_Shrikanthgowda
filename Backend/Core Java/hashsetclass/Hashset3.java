import java.util.HashSet;

public class Hashset3 {
public static void main(String[] args) {
	HashSet<Student> s= new HashSet<Student>();
	s.add(new Student(22,"shri"));
	s.add(new Student(23,"ram"));
	s.add(new Student(24,"sam"));
	s.add(new Student(22,"shri"));
	s.add(new Student(22,"shri"));
	for (Student s1 : s) {
		System.out.println(s1.name + " and age is "+ s1.age);
	}
	
}
}
