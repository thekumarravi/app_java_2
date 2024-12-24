package P1;

import java.io.File;

public class E {
	public static void main(String[] args) {
		File f = new File("pathname:D:\\hello\\A.txt");
		String[] names = f.list();
		for (String name:names) {
			System.out.println(name);
		}
		System.out.println(names.length);
	}

}
