package throwkey;

public class GoogleMap {
 void findLocation(String a) {
	try {
		System.out.println(a.length());
	}catch(NullPointerException n) {
		System.out.println("Google userplz fill the location");
		throw n;
	}
 }
}
