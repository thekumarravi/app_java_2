package P1;
import java.io.BufferedReader;
import java.io.FileReader;
public class K {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader(fileName:"Users/kumarravi/Desktop/hello");
            BufferedReader br  = new BufferedReader(fr);
            System.out.println(br.readLine());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
