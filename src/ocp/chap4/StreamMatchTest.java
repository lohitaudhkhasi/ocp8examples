package ocp.chap4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamMatchTest {
	public static void main(String[] args) {
		Stream<Integer> testStream = Stream.of();
		System.out.println("All match:" + testStream.allMatch(x -> true));
		testStream = Stream.of();
		System.out.println("Any match:" + testStream.anyMatch(x -> true));
		testStream = Stream.of();
		System.out.println("None match:" + testStream.noneMatch(x -> true));
		testStream = Stream.of();
		System.out.println("Find any:" + testStream.findAny());
		testStream = Stream.of();
		System.out.println("Find first:" + testStream.findFirst());
		Map<String, String> testMapForPrinting = new HashMap<>(2);
		testMapForPrinting.put("test", "a");
		testMapForPrinting.put("test1", "b");
		System.out.println(testMapForPrinting);
		String[] test = new String[2];
		test[0] = "test";
		test[1] = "test1";
		System.out.println(Arrays.toString(test));
		Deque<String> testDeque = new ArrayDeque<>();
		testDeque.offer("test");
		System.out.println(testDeque);

	}
}
