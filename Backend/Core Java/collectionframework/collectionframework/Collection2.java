package collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
public static void main(String[] args) {
	Collection c= new ArrayList<>();
	c.add("shri");
	c.add("praj");
	System.out.println(c);
	System.out.println(c.size());
	System.out.println(c.remove("shri"));
	System.out.println(c);
	System.out.println(c.contains("shri"));
}
}
