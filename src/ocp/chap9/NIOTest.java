package ocp.chap9;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;

public class NIOTest {
	public static void main(String args[]) {
		Path path1 = Paths.get("C:\\fish.txt");
		Path path2 = Paths.get("C:\\foo\\birds.txt");
		System.out.println(path1.relativize(path2));
		Path path3 = Paths.get("E:\\data");
		Path path4 = Paths.get("E:\\user\\home");
		Path relativePath = path3.relativize(path4);
		System.out.println(relativePath);
		System.out.println(path3.resolve(relativePath));
		// System.out.println(path3.resolve(relativePath).normalize().toRealPath(LinkOption.NOFOLLOW_LINKS));
		Path path5 = Paths.get("D://newfolder");
		try {
			Files.createDirectories(path5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Files.copy(Paths.get("D://true.txt"),
		// Paths.get("D://newfolder/true.txt"));
		try {
			Files.list(path5).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Files.createSymbolicLink(Paths.get("D://sc-true.txt"),
		// path5.resolve(Paths.get("D://true.txt")));
		System.out.println(Files.isSymbolicLink(Paths.get("D://sc-true.txt")));
		try {
			Files.copy(
					Paths.get("D://sc-true.txt").toRealPath(
							LinkOption.NOFOLLOW_LINKS),
					Paths.get("D://newfolder/sc-true.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Files.readAllLines(path5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileTime ft = FileTime.fromMillis(Instant.now().toEpochMilli());
		System.out.println(ft.toInstant());

	}
}
