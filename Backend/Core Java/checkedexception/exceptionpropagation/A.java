package exceptionpropagation;

public class A {
public static void main(String[] args) {
	System.out.println("main start");
	try {
		B.n();
	} catch (ClassNotFoundException e) {
 System.out.println("class is not found in A class");
	}
	System.out.println("main end");
}
}
