package checkedexception;

public class ExceptionB {
	public static void main(String[] args) {
		System.out.println("main started");
		Student s1= new Student();
		try {
			Object o1= s1.clone();
			System.out.println("object is clonned");
			Class c1=Class.forName("checkedexception.Student");
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone is not supported");
		} catch (ClassNotFoundException c) {
			System.out.println("class is not found");
		}
		System.out.println("main ended");
	}
}
