package execption;

public class Calculator {
  void divide(int a,int b) {
	  System.out.println("divide start");
	  try{
		  System.out.println(a/b);
	  }catch(ArithmeticException e) {
		  System.out.println("Dont divide by zero");
	  }
	  System.out.println("divided");
  }
}
