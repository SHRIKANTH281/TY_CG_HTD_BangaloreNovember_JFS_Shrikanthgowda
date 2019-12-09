package collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
 public static void main(String[] args) {
	Collection c1=new ArrayList();
	//adding an element inside the collection
	c1.add(28);
	System.out.println(c1);
	//removing element fron the collection
	System.out.println(c1.remove(28));
	//checking collection is empty or not
	System.out.println(c1.isEmpty());
	c1.add(28);
	//checking whether 28 object is there or not inside the collection
	System.out.println(c1.contains(28));
}
}
