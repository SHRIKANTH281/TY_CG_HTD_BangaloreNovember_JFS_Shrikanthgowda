import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Fileoutput {
	public static void main(String[] args) {
		try {
			FileOutputStream f1= new FileOutputStream("praj.txt");
			String s1="prajwitha";
			byte[] b1=s1.getBytes();
			f1.write(b1);
			System.out.println("sucess....");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
