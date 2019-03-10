package ocp.chap7;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ConcurrencyTest {
	public static void main(String[] args) {
		List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		IntStream stream = IntStream.rangeClosed(1, 7);
		stream.parallel().map(x -> {
			list.add(x); // Line 13
				return x;
			}).forEach(System.out::print); // Line 15
		System.out.println();
		list.forEach(System.out::println); // Line 17
		System.out.println(Instant.now());
		System.out.println(OffsetDateTime.now());
		List<Integer> ls = Arrays.asList(11, 11, 22, 33, 33, 55, 66);
		System.out.println(ls.stream().noneMatch(x -> x % 11 > 0));

	}
}

class TestClass {
	static int si = 10;
	int ii = 20;

	public void inner() {

		int ai = 30; // automatic variable
		ai = 31;// ai is not effectively final anymore.
		int fai = 40; // automatic final variable
		class Inner {
			public Inner() {
				// System.out.println(si++ + "  " + ii++ + "   " + fai++ + " "
				// + ai++);
			}
		}
		new Inner();
	}

	public static void main(String[] args) {
		new TestClass().inner();
	}
}