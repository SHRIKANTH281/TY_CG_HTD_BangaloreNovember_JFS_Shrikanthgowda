
public class Initializer {
	final int MAXIMUM;
	static final double PI;
	Initializer(){
		System.out.println("constructor executed");

	}
	{
		System.out.println("Instance Initializer Executed");
		this.MAXIMUM=30000;
	}
	static {
		System.out.println("Static Initializer Executed");
	  PI=3.142;
	}
}
