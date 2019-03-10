package ocp.stream;

import java.util.stream.Stream;

/**
 * Sequential Parallel iterator SplitIterator forEach forEachOrdered close
 * onClose
 * 
 * @author lohaudhk
 *
 */
public class BaseStreamTest {
	public static void main(String args[]) {
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		// s.iterator().forEachRemaining(System.out::println);
		s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).parallel();
		// s.spliterator().forEachRemaining(System.out::println);
		s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).parallel();
		s.filter(x -> x > 0).forEach(System.out::println);
		s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).parallel()
				.sequential();
		s.filter(x -> x > 0).forEach(System.out::println);
		s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).parallel()
				.onClose(() -> {
					System.out.println("I am closed");
					return;
				});
		s.filter(x -> x > 0).forEachOrdered(System.out::println);
		s.close();

	}
}
