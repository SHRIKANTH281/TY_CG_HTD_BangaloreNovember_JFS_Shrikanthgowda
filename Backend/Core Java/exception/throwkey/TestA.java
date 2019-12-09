package throwkey;

public class TestA {
public static void main(String[] args) {
	System.out.println("main start");
	GoogleMap g1=new GoogleMap();
	Ola o=new Ola(g1);
	o.find(null);
	System.out.println("main end");
	
}
}
