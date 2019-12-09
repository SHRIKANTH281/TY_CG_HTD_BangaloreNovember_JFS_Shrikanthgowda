package execption;

public class TestA {
 public static void main(String[] args) {
	System.out.println("main start");
	Calculator c= new Calculator();
	c.divide(10, 0);
	System.out.println("main end");
}
}
