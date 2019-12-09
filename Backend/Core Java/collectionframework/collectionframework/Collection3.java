package collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
public static void main(String[] args) {
	Collection c=new ArrayList<>();
	c.add(12);
	c.add(23);
	Collection c1=new ArrayList<>();
	c1.add(13);
	c1.add(24);
	c1.addAll(c);
	System.out.println(c1);
	System.out.println("------remove all-------");
	Collection c2=new ArrayList<>();
	c2.add(12);
	c2.add(23);
	c2.add(13);
	Object a[] =c2.toArray();
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	Collection c3=new ArrayList<>();
	c3.add(13);
	c3.add(24);
	System.out.println(c2.removeAll(c3));
	System.out.println(c2);
	System.out.println("-----retain all-----");
	Collection c4=new ArrayList<>();
	c4.add(12);
	c4.add(23);
	c4.add(13);
	Collection c5=new ArrayList<>();
	c5.add(12);
	c5.add(23);
	c5.add(55);
	System.out.println(c4);
	System.out.println(c4.retainAll(c5));
	c4.clear();
	System.out.println(c4);
	
}
}
