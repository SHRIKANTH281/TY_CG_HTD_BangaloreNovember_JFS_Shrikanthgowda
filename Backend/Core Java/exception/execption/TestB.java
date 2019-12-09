package execption;

public class TestB {
 void write() {
	 String s=null;
	 try{
		 System.out.println(s.length());
	 }catch(RuntimeException r) {
		 System.out.println("don't deal with null");
	 }
 }
 public static void main(String[] args) {
	 System.out.println("start");
	TestB b=new TestB();
	b.write();
	System.out.println("end");
	
}
}
