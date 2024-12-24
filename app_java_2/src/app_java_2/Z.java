package app_java_2;

public class Z {
	static int x = 10;
	static Z z1 = new Z();
	public static void main(String[] args) {
		System.out.println(x);//Correct
		System.out.println(z1);//Correct
		z1.test();
	}
	public void test() {
		System.out.println(x);//Correct
		System.out.println(z1);//Correct
	}

}
