package app_java_2;

public class B {
	public static void main(String[] args) {
		B b1 = new B();
		int x = b1.test();
		System.out.println(x);
	}
	public int test() {//non static & not a void method
        return 100;
        }
}