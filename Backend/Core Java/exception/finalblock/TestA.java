package finalblock;

public class TestA {
public static void main(String[] args) {
	System.out.println("main started");
	try{
		System.out.println(10/0);
	}catch(ArithmeticException a) {
		System.out.println("dont deal with zero");
	}finally {
		System.out.println("finally blockis executed");
	}
	System.out.println("main end");
}
}
