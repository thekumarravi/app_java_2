package app_java_2;

public class M {
	public static void main(String[] args) {
		M m1 = new M ();
		int x = m1.test();
		System.out.println(x);
	}
	public int test() {
		return 100;
		System.out.println(200);//Unreachable code
	}

}
