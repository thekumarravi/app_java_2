package P1;

import java.io.File;

public class A {
	public static void main(String[] args) {
		
		try {
		
		     File f = new File("pathname:d:\\hello\\A.txt");
		     boolean val = f.createNewFile();
		     System.out.println(val);
		}catch(IoException e) {
			e.printStackTrace();
		}
		
	
	}
	
}
	
