package ocp.pages.notes2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Page2 {
	public static void main(String[] args) {
		Immutable i1 = new Immutable("test1");
		Immutable i2 = new Immutable("test2");
		Immutable i3 = new Immutable("test3");
		List<Immutable> imList = Arrays.asList(i1, i2);
		imList.stream().forEach(x -> x = i3);
		System.out.println(imList);
		/**
		 * Collectors.averagingDouble Collectors.map Collectors.toList
		 * Collectors.joining Collectors.groupBY Collectors.partitionBy
		 * Collectors.reducing,
		 */
		Immutable finalList = imList.stream().collect(
				Collectors.reducing(new Immutable("test0"), Immutable::add));
		System.out.println(finalList);
	}
}

class Immutable {
	private final String name;

	Immutable(String name) {
		this.name = name;
	}

	public String toString() {
		return "tostring:" + this.name;
	}

	public String getName() {
		return name;
	}

	public static Immutable add(Immutable a, Immutable b) {
		return new Immutable(a.getName() + b.getName());
	}
}