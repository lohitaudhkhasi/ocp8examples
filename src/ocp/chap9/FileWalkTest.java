package ocp.chap9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileWalkTest {
	public static void main(String agrs[]) {
		try {
			Stream<Path> files = Files.walk(
					Paths.get("D://eclipseworkspace//ocp//"), 10);
			long count = files
					.filter(x -> x.toFile().getName().endsWith(".java"))
					.peek(System.out::println).count();
			System.out.println(count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
