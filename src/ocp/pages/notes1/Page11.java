package ocp.pages.notes1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Page11 {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("D://test12.log");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			// FileTIme
			Path p = Paths.get("D://test12.log");
			Object o = Files.getAttribute(Paths.get("D://test12.log"),
					"creationTime");
			BasicFileAttributes battributes = Files.readAttributes(p,
					BasicFileAttributes.class);
			System.out.printf("%s%n%s%n%s%n%s%n%s%n ",
					battributes.isDirectory(), battributes.isOther(),
					battributes.isRegularFile(), battributes.creationTime(),
					battributes.lastAccessTime());
			System.out.println(o);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
