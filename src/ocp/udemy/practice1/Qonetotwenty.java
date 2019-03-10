package ocp.udemy.practice1;

import java.io.Closeable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Qonetotwenty {
	public static void main(String[] args) {
		try (Resource1 r1 = new Resource1(); Resource2 r2 = new Resource2()) {
			System.out.println("Test");
		}
		IntStream is = IntStream.range(1, 5);
		OptionalInt sum = is.reduce((a, b) -> a + b);
		System.out.println(sum.orElse(0));

		Path p1 = Paths.get("photos\\..\\beaches\\.\\calangute\\a.txt");
		Path p2 = p1.normalize();
		System.out.println(p1);
		System.out.println(p2);
		Path p3 = p1.relativize(p2);
		System.out.println(p3);
		List<String> al = Arrays.asList("aa", "aaa", "b", "cc", "ccc", "ddd",
				"a");
		long count = al.stream().filter((str) -> str.compareTo("c") < 0)
				.count();

		System.out.println(count);
		Path x = Paths.get("c:\\test\\..\\c.txt");
		System.out.println(x.toAbsolutePath());
		System.out.println(x.normalize().toAbsolutePath().getRoot());
	}
}

class Resource1 implements Closeable {
	@Override
	public void close() {
		System.out.println("Resource1");
	}
}

class Resource2 implements AutoCloseable {
	@Override
	public void close() {
		System.out.println("Resource2");
	}
}

class Book {
}

class TextBook extends Book {
}

class BookList<T> extends ArrayList<T> {
	public int count = 0;

	@Override
	public boolean add(Object o) {
		if (o instanceof Book)
			return super.add((T) o);
		else
			return count++ == -1;
	}
}
