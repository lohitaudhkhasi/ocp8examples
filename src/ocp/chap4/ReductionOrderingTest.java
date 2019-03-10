package ocp.chap4;

import java.util.Arrays;
import java.util.HashSet;

public class ReductionOrderingTest {
	public static void main(String... args) {
		final String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
		System.out.println("Alphabet: ".concat(Arrays.toString(alphabet)));
		System.out.println(new HashSet<>(Arrays.asList(alphabet))
				.parallelStream().peek(System.out::println)
				.reduce("", (a, b) -> a + b, (a, b) -> a + b));
	}
}
