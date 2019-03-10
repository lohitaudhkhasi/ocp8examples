package ocp.chap3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIteratorTest {
	public static void main(String[] args) {
		Integer x[] = { 0, 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(x);
		System.out.println(list);

		Iterator<Integer> itr = list.listIterator(6); // Position in list from
														// where we want to
														// start
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
