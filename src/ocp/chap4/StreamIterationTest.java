package ocp.chap4;

import java.util.stream.Stream;

public class StreamIterationTest {
	public static void main(String[] args) {
		Stream<Integer> testStream = Stream.iterate(1, n -> n + 2).limit(10);
		testStream.forEach(System.out::println);
	}
}
