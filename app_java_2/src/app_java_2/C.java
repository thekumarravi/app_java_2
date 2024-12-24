package app_java_2;

public class C {
	public static  void main(String[] args) {
		C c1 = new C();
		String x = c1.test();
		System.out.println(x);//mike
		
	}
	public String test() {//non static & not a void method
        return "mike";
	}
}
