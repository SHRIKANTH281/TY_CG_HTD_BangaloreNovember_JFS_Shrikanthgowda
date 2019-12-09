
public class TestCalculator {
public static void main(String[] args) {
	Calculator c=new Calculator();
	int r1=c.add(12);
	System.out.println("result 1 is "+r1);
	int r2=c.add(12, 20);
	System.out.println("result 2 is "+r2);
	double r3=c.add(12.44);
	System.out.println("result 3 is "+r3);
	Calculator.multiply(23);
	Calculator.multiply(12, 200);
	Calculator.multiply(12.33);
}
}
