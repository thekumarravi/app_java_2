package P1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class P {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(name:"D:Users/kumarravi/Desktop/hello");
			ObjectInputStream ois = new ObjectInputStream(fis);

		N obj = (N)ois.readObject();
		System.out.println(obj.name);
	}
	catch (Exception e) {
		e.printStackTrace();
	 }

}
