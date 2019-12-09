
public class TestPerson {
public static void main(String[] args) {
	System.out.println("-----main start-------");
	Person p1= new Person("shri");
	p1=null;
	System.gc();
	System.out.println("-----main end---------");
	
}
}
