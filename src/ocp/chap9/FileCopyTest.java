package ocp.chap9;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyTest {
	public static void main(String args[]) {
		Path p1 = Paths.get("D://temp");
		Path p2 = Paths.get("D://temp1");
		try {
			Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Operation successful");
		} catch (FileAlreadyExistsException fe) {
			System.out.println("Files aready exists");
		} catch (DirectoryNotEmptyException doe) {
			System.out.println("Directory not empty");
		} catch (IOException ioe) {
			System.out.println("Some IOEException");
		} catch (SecurityException se) {
			System.out.println("Security Exception");
		}

		System.out.println(Files.exists(Paths.get("D://temp/temp.txt")));
		Path p3 = Paths.get("D://temp/temp.txt");
		Path p4 = Paths.get("D://temp/../temp/temp.txt");
		try {
			System.out.println(Files.isSameFile(p3, p4));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
