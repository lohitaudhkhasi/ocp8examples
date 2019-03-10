package ocp.chap4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ForEachOrderedTest {
	public static void main(String[] args) {
		LocalDateTime t1 = LocalDateTime.now();
		List<Integer> xList = new ArrayList<>();
		IntStream.rangeClosed(1, Integer.MAX_VALUE / 5).parallel()
				.filter(x -> x % 6 == 0).forEach(x -> {
					// System.out.println(x);
						xList.add(x);
					});
		LocalDateTime t2 = LocalDateTime.now();
		System.out.println(Duration.between(t1, t2));
		List<Integer> xsubList = xList.subList(0, 20);
		System.out.println(xsubList);
	}
}
