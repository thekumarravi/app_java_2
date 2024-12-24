package app_java_2;

public class G {
	public static void main(String[] args) {
		G g1 = new G();
		g1.test(1000, "mike", 10.3);
	}
	public void test(int x,String y,double z) {//static
		System.out.println(x);//1000
		System.out.println(y);//mike
		System.out.println(z);//10.3
	}

}
