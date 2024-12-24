package app_java_2;

public class I {
	public static void main(String[] args) {
		I i1 = new I();
		i1.test();
		return;//stops the program execution
	}
	public void test() {
		System.out.println(100);
		return;//returns control to line number 6
	}

}
