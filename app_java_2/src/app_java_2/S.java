package app_java_2;

public class S {
	static int x = 10;
	public static void main(String[] args) {
		System.out.println(S.x);
		
		S s1 = new S();
		s1.test();
	}
	public void test() {
		System.out.println(S.x);
	}
	
	

}
