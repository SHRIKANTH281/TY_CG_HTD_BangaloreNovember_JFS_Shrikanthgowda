
public class Demo6 {
public static void main(String[] args) {
	Demo5 d1=new Demo5("shri",22);
	System.out.println(d1.hashCode());
	d1=new Demo5("ram", 22);
	System.out.println(d1.hashCode());
	String s=d1.getName();
	int a=d1.getAge();
	System.out.println("name is "+s);
	System.out.println("age is "+a);
}
}
