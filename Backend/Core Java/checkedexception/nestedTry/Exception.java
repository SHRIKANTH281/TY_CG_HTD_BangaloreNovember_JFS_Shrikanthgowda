package nestedTry;

public class Exception {
	public static void main(String[] args) {
		System.out.println("main Started");
		Employee e1= new Employee();
		try {
			Object o1=e1.clone();
			try {

				Class c1=Class.forName("nestedTry.Employee");
				System.out.println("class is found");
			} catch (ClassNotFoundException c) {
				System.out.println("class not found");
			}
		} catch (CloneNotSupportedException e) {
			System.out.println("clone is not supported");
		}
		System.out.println("main ended");
	}
}
