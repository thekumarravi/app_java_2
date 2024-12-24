package P1;

import java.io.FileWriter;
import java.io.IOException;

public class H {
	public static void main(String[] args) {
	try {
		FileWriter fw = new FileWriter("A.txt",append:flase);
		fw.write(a:97);
		fw.write("mike");
		fw.write("100");
		fw.close();//save the file
	}catch (IOException e) {
		e.printStackTrace();
		
	    }
	}
}
