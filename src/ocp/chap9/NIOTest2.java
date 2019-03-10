package ocp.chap9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.attribute.UserPrincipal;
import java.time.Duration;
import java.time.ZonedDateTime;

public class NIOTest2 {
	public static void main(String args[]) {
		Path path = Paths.get("D://true.txt");
		try {
			System.out.println(Files.getOwner(path).getName());
			System.out.println(path.getFileSystem()
					.getUserPrincipalLookupService()
					.lookupPrincipalByName("lohaudhk"));
			UserPrincipal userPrincipal = path.getFileSystem()
					.getUserPrincipalLookupService()
					.lookupPrincipalByName("lohaudhk");
			Files.setOwner(path, userPrincipal);
		} catch (IOException e) {

		}
		ZonedDateTime zd = ZonedDateTime.now();
		ZonedDateTime zd1 = zd.minusHours(1);
		System.out.println(Duration.between(zd, zd1));
		Path p1 = Paths.get("\\photos\\vacation");
		Path p2 = Paths.get("\\yellowstone");
		System.out.println(p2.getRoot());
		System.out.println(p1.resolve(p2) + "  " + p1.relativize(p2));
		Path p3 = Paths.get("c:\\company\\records\\customers.dat");
		System.out.println(p3.getName(0));
		Path p4 = Paths.get("c:", p3.subpath(0, 1).toString(), "clients.dat");
		System.out.println(p4);

		Path p11 = Paths.get("C:\\personal\\.\\photos\\..\\readme.txt");
		Path p12 = Paths.get("personal\\index.html");
		Path p13 = p11.resolve(p12);
		System.out.println("at line 36:" + p13);

		Path p21 = Paths.get("c:\\personal\\.\\photos\\..\\index.html");
		Path p22 = Paths.get("c:\\personal\\index.html");
		Path p23 = p22.normalize().relativize(p22);
		System.out.println(p23);
		try {
			System.out.println(Files.isSameFile(p21, p22));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Path p31 = Paths.get("test.txt");
		System.out.println(p31.normalize());
	}
}
