package ocp.chap10;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class RelativizeTest {
	public static void main(String args[]) {
		Path p1 = Paths.get("C:\\test.java");
		Path p2 = FileSystems.getDefault().getPath("D:\\test.java");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.resolve(p2));
	}
}
