package ocp.chap4;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String args[]) {
		IntStream is0 = IntStream.range(1, 1);
		System.out.println(is0.findAny());
		IntStream is1 = IntStream.range(1, 3);
		IntStream is2 = IntStream.rangeClosed(1, 3);
		IntStream is3 = IntStream.concat(is1, is2);
		Object val = is3.boxed().collect(Collectors.groupingBy(k -> k)).get(3);
		System.out.println(val);

		System.out.println(IntStream.range(-10, -10).count());
		System.out.println(IntStream.rangeClosed(-10, -10).count());
		System.out.println(Boolean.TRUE);
		LocalDateTime dt = LocalDateTime.parse("2018-03-16t10:15:30.22");
		System.out.println(dt.toLocalDate() + " " + dt.toLocalTime());
		Path p = Paths.get("C:\\a\\b");
		p.forEach(System.out::println);
		System.out.println(p.iterator().next());
		Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US")
				.build();
		Locale l2 = Locale.US;
		Locale l3 = new Locale("en");

		System.out.println(l1.equals(l2));
		System.out.println(l2.equals(l3));
		Printer<String> p1s = new Printer<>();
		StringBuilder s = new StringBuilder("abc");
		s.reverse();
		System.out.println(s);
		Stream<Double> stream = Stream.generate(() -> new Double("1.0"));
		System.out.println(stream.sorted().findFirst());
		Path path = Paths.get("F:\\a\\b");
	}

	private static void m() throws SQLException {

	}
}

class Printer<T extends String> {
}