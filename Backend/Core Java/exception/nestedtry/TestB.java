package nestedtry;


public class TestB {
public static void main(String[] args) {
	ExceptionB e= new ExceptionB();
	System.out.println("main Start");
	e.exception(0, "Ramu");
	e.exception(2, null);
	System.out.println("main end");
}
}

