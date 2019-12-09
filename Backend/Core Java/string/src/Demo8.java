
public class Demo8 {
public static void main(String[] args) {
	StringBuffer s1= new StringBuffer("shri");
	System.out.println(s1.hashCode());
	s1=s1.append(" kanth");
	System.out.println(s1.hashCode());
}
}
