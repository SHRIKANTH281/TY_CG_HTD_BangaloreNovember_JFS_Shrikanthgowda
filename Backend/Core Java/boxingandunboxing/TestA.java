
public class TestA {
public static void main(String[] args) {
	int i1 =10;
	//boxing
	Integer i2= new Integer(i1);
	//unboxing
	int i3=i2.intValue();
	
	double d1=3.14;
	//boxing
	Double d2= new Double(d1);
	//unboxing
	double d3=d2.doubleValue();
	
	System.out.println(i1);
	System.out.println(i2);
	System.out.println(i3);
	
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);
}
}
