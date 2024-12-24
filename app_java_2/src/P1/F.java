package P1;

import java.io.File;
import java.io.FileReader;

public class F {
	public static void main(String[] args) {
		try {
			File f = new File("pathname:D:\\hello\\A.txt");
	        FileReader fr = new FileReader(f);
	        for(int i=0;i<f.length();i++) {
	        	System.out.println((char)fr.read());
	    }
		}catch (Exception e) {
		throw new RuntimeException(e);
	    }
	}
}
	
