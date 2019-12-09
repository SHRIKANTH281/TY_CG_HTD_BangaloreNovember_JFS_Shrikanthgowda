package exceptionpropagation;

public class A {
  static void o() {
	  try{
		  B.m();
	  }catch(ArithmeticException e) {
		  System.out.println(e.getMessage());
	  }
  }
}
