package P1;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class L {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter(fileName:"Users/kumarravi/Desktop/hello");
            BufferedWriter bw  = new BufferedWriter(fw);
			bw.write(c:97);
            bw.newLine();
            bw.write(str:"mike");
            bw.newLine();
            char[] ch = {'a','b'};
            bw.write(ch);
            bw.close();
            fw.close();
            
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
