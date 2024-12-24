package app_java_2;

public class J {
	public static void main(String[] args) {
		J j1 = new J();
		j1.test();
	}
	public void test() {
		return ;//Returns control to line number 6
		System.out.println(100);//Unreachable code
	    }
}
