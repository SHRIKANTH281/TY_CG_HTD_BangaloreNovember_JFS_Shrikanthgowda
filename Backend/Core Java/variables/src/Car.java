
public class Car extends Vehicle {
 int cost = 50000;
  void  details(){
	  int cost=20000;
	  System.out.println("local variable value is"+cost);
	  System.out.println("globle variable value is"+this.cost);
	  System.out.println("super class variable value is"+super.cost);
  }
}
