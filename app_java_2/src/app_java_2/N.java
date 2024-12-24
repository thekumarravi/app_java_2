package app_java_2;

public class N {
	public static void main(String[] args) {
		int x = 20;//Created
		System.out.println(x);//Using
		M m1 = new M();
		m1.test();
	}
	public void test() {
		System.out.println(x);//Error
	}

}
