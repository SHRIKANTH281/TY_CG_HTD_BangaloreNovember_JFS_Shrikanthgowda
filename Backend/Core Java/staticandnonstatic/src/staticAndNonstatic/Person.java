package staticAndNonstatic;

public class Person {
	static int age;
	String name;
	void personDetails() {
		System.out.println("Name is "+name+" and age is "+age);
		personDetailsStatic();
}
	static void personDetailsStatic() {
		System.out.println(age);
	}
}
