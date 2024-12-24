package app_java_2;

public class U {
	static int x;//Not Initialized
	public static void main(String[] args) {
		System.out.println(U.x);
		System.out.println(x);
		
		//Wrong Approach
		U u1 = new U();
		System.out.println(u1.x);//U.x
		
	}
}	


