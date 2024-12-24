package P1;

import java.io.File;
import java.io.FileReader;

public class G {
	public static void main(String[] args) {
		try {
			File f = new File("pathname:D:\\hello\\A.txt");
	        FileReader fr = new FileReader(f);
	        char[] ch=new char[(int)f.length()];
	    		   fr.read(ch);
	        for (char c:ch) {
	    	System.out.println(c);
	        }
	    }catch (Exception e) {
		throw new RuntimeException(e);
	    }
	}
}
	
