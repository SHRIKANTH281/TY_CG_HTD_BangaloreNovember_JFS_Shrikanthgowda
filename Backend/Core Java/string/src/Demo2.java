
public class Demo2 {
public static void main(String[] args) {
	String s1=new String("shrii");
	System.out.println(s1.hashCode());
	String s2=new String("mikel");
	String s3=new String("shrii");
	s1=new String("praj");
	System.out.println(s1.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s2.hashCode());
}
}
