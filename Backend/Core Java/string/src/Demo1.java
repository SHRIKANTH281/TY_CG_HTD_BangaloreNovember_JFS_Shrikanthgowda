
public class Demo1 {
 public static void main(String[] args) {
	String s1="shri";
	System.out.println("s1 hashcode value "+s1.hashCode());
	String s2="ram";
	s1="krishna";
	String s3="shri";
	System.out.println("s1 hashcode value "+s1.hashCode());
	System.out.println("s3 hashcode value "+s3.hashCode());
}
}
