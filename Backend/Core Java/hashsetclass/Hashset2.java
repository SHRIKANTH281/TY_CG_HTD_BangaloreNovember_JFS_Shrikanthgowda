import java.util.HashSet;

public class Hashset2 {
public static void main(String[] args) {
	HashSet<String> hs1= new HashSet<String>();
	hs1.add("shri");
	hs1.add("ram");
	hs1.add("sam");
	hs1.add(null);
	hs1.add("praj");
	for (String s1 : hs1) {
		System.out.println(s1);
		
	}
}
}
