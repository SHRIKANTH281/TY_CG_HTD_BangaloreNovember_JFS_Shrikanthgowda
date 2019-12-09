
public abstract class Vehicles {
	static String regNo;
	String name;
	void run() {
		System.out.println("running");
	}
	abstract void start();
	abstract void stop();
	static {
		regNo="KA19";
	}
	{
		name="Honda";
	}
}
