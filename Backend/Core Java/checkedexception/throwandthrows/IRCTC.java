package throwandthrows;

public class IRCTC {
	void confirmTicket() throws ClassNotFoundException {
		try {
			Class c1= Class.forName("throwandthrows.Paytm");
			System.out.println("booking is confirmed");
		} catch (ClassNotFoundException e) {
			System.out.println("booking is not confirmed");
			throw e;
		}

	}
}
