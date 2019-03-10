package ocp.misc;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

//Hierarchy of ifle save options : r (read only) -> rw -> rwd(data synced synchronously) -> rwf(both data and content synced )
public class MiscRAFTest {
	public static void main(String args[]) {
		try (RandomAccessFile raf = new RandomAccessFile("D:\\file.txt", "rws")) {
			raf.seek(raf.length() - 5);
			raf.writeChars("FINAL TEXT");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileSystem fs = FileSystems.getDefault();
		Iterable<Path> roots = fs.getRootDirectories();
		for (Path p : roots) {
			System.out.println(p);
		}
		// Write() of Output streams write only single byte
		// FileSystems.getDefault().getPathMatcher("?.{jpg}");
		Set<String> setStream = new HashSet<>();
		String reson = setStream.stream().map(x -> "'" + x + "'")
				.collect(Collectors.joining(","));
		List<Integer> friends = Arrays.asList(new Integer(31), new Integer(32),
				new Integer(33));
		OptionalDouble averageAge = friends.stream().filter(f -> f < 30)
				.mapToInt(f -> f).average();
		System.out.println(averageAge);
		System.out.println(averageAge);
		friends.replaceAll(x -> x * 2);
		friends.forEach(System.out::println);
		LocalDateTime ld1 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 2, 0); // 7

		ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
		LocalDateTime ld2 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 1, 0); // 5
		ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
		long x = ChronoUnit.HOURS.between(zd1, zd2); // (zd2 - zd1) = 5-7 = -2
		System.out.println(x);
		Printer<T> obj = new Printer<>(new T());
		System.out.println(obj);
		StringConsumer consumer = s -> System.out.println(s.toLowerCase());

		List<String> list = Arrays.asList("Dr", "Mr", "Miss", "Mrs");
		list.forEach(consumer);
		Map m = null;
	}
}

abstract class Saloon {
	protected int m1() {
		return 0;
	}
}

class OverridingSaloon extends Saloon {
	public int m1() {
		return 1;
	}

}

class T {
	@Override
	public String toString() {
		return "T";
	}
}

class Printer<T> {
	private T t;

	Printer(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return t.toString();
	}
}

class Outer implements StringConsumer {
	abstract static class Animal { // Line 2
		abstract void eat();
	}

	static class Dog extends Animal { // Line 6
		void eat() { // Line 7
			System.out.println("Dog eats biscuits");
		}
	}
}

interface StringConsumer extends Consumer<String> {

}