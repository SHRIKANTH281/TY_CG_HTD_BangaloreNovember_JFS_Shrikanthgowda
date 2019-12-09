package customuncheckdexception;

public class SBIAtm {
public static void main(String[] args) {
	System.out.println("main start");
	AtmSimulator a= new AtmSimulator();
	try{
		a.withdraw(41000);
	}catch(DayLimitException d) {
		System.out.println(d.getMessage());
	}
	System.out.println("main end");
}
}
