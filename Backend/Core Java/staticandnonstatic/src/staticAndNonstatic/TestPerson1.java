package staticAndNonstatic;

public class TestPerson1 {
public static void main(String[] args) {
	Person1 p1=new Person1();
	p1.age=23;
	p1.name="shri";
	p1.personDetails();
	Person1 p2=new Person1();
	p2.initialize(21, "praj");
	p2.personDetails();
}
}
