
public class BankTest {
public static void main(String[] args) {
	Atm a=new Atm();
	Bank b=new Bank();
	Canara c=new Canara();
	SBI s=new SBI();
	HDFC h=new HDFC();
	a.takeCash(c);
	a.takeCash(h);
}
}
