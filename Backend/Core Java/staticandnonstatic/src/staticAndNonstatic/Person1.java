package staticAndNonstatic;

public class Person1 {
 int age;
 String name;
 void personDetails() {
	 System.out.println("name is "+name+" age is "+age);
 }
 void initialize(int a,String n) {
    age=a;
    name=n;
 }
}
