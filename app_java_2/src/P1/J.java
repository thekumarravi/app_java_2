package P1;

import java.io.FileWriter;
import java.io.IOException;

public class J {
	public static void main(String[] args) {
		try {
			
			FileWriter fw = new FileWriter("filename:Users/kumarravi/Desktop/hello");
			fw.write("Line1");
			fw.write("\n");
			fw.write("Line2");
			fw.write("\n");
			fw.write("line3");
			fw.close();
		}catch (IOException e) {
			e.printStackTrace();
	 }
  }		
}
