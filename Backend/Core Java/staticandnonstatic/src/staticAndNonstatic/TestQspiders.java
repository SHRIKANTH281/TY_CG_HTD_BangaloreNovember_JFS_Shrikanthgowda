package staticAndNonstatic;

public class TestQspiders {
public static void main(String[] args) {
	Qspiders BTM= new Qspiders();
	BTM.swipe();
	BTM.swipe();
	Qspiders BTR=new Qspiders();
	BTR.swipe();
	System.out.println(BTM.branchCount);
	System.out.println(BTR.branchCount);
	System.out.println(Qspiders.totalCount);
}
}
