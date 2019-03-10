package ocp.chap8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOTest {
	public static void main(String args[]) {
		File f = new File("z:\\a\\b\\c\\d");
		System.out.println(f.getParent());
		System.out.println(f.getParentFile());
		OutputStream os = null;

		try {
			os = new FileOutputStream("D:\\temp.txt");
			os.write(99);
			os.flush();
			os.close();
			System.out.println(String.valueOf(99));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
