package customuncheckdexception;

public class AtmSimulator {
 void withdraw(double d) {
	 if(d>40000) {
		 throw new DayLimitException("user limit is excessed");
	 }
 }
}
