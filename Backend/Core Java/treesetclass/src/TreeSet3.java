import java.util.TreeSet;

public class TreeSet3 {
public static void main(String[] args) {
	EmployeeName e1= new EmployeeName();
	EmployeeAge e2= new EmployeeAge();
	EmployeeSalary e3= new EmployeeSalary();
	TreeSet<Employee> t1= new TreeSet<Employee>(e1);
	t1.add(new Employee(22, 34000, "shri"));
	t1.add(new Employee(23, 24000, "sam"));
	t1.add(new Employee(24, 14000, "ram"));
	for (Employee e : t1) {
		System.out.println("employee name is "+e.name);
		System.out.println("employee age is "+e.age);
		System.out.println("employee salary is "+e.salary);
		System.out.println("-----------------------------");
		
	}
}
}
