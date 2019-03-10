package ocp.chap4;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SupplierTest {
	public static void main(String args[]) {
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> bicon = map::put;
		bicon.accept("test", 2);
		System.out.println(map);
		IntBinaryOperator reducer1 = (x, y) -> x + y;
		IntSupplier intsupplier = () -> ThreadLocalRandom.current().nextInt();
		int result = IntStream.generate(intsupplier).limit(5)
				.peek(System.out::println).reduce(reducer1).getAsInt();
		System.out.println(result);
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		// Reduce(U identity, BiFunction,BinaryOperator) // UBFBO
		// Collect (Supplier, BiConsumer, BiConsumer) // SBCBC , also called
		// mutable reduction
		TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add,
				TreeSet::addAll);
		System.out.println(set);
		Comparator.reverseOrder();
		IntStream intStream = IntStream.of(1, 2, 3);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble());
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		// String resultStr = ohMy.collect(Collectors.joining(","));
		Map<Integer, String> treeMap = ohMy.collect(Collectors.toMap(
				String::length, k -> k, (str1, str2) -> str1 + "," + str2));
		// System.out.println(resultStr);
		System.out.println(treeMap);
		Stream<String> testString = Stream.iterate("", (s) -> s + 1);
		System.out.println(testString.limit(2).map(x -> x + "2")
				.collect(Collectors.joining(",")));
	}

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		else {
			int sum = 0;
			for (int score : scores)
				sum += score;
			return Optional.of((double) (sum / scores.length));
		}
	}
}

@FunctionalInterface
interface ownCounsumer<T> {
	void accept(T t);
}
