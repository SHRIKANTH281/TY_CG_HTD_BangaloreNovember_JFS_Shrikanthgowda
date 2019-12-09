package exceptionpropagation;

public class C {
 static void n() {
	 try{
		 System.out.println(10/0);
	 }catch(ArithmeticException e) {
		 System.out.println("C "+e.getMessage());
		 throw e;
	 }
 }
}
