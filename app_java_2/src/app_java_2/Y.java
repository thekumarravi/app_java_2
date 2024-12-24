package app_java_2;

public class Y {
	public static void main(String[] args) {
		int x = 10;//Local 
		Y y1 = new Y();//local Reference variable
		System.out.println(x);
		System.out.println(y1);
	}
	public void test() {
		System.out.println(x);//Error
		System.out.println(y1);//Error
	}

}
