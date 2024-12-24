package P1;

import java.io.FileWriter;
import java.io.IOException;

public class I {
	public static void main(String[] args) {
	try {
		FileWriter fw = new FileWriter("A.txt",append:ture);
		char[] ch = {'a','b','c','d'};
		fw.write(ch);
		fw.close();//save the file
	}catch (IOException e) {
		e.printStackTrace();
		
	    }
	}
}
