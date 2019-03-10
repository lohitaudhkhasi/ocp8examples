package ocp.chap3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapTest {
	static BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2
			.length() ? v1 : v2;

	public static void main(String args[]) {
		Map<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("lion", "first");
		// treeMap.contains("lion"); // compilation error because contains is
		// method of collection interface and Map ois not part of collection
		System.out.println(treeMap.containsKey("lion"));
		System.out.println(treeMap.containsValue("first"));
		Map<String, String> favorites = new HashMap<>();
		// Merge function is called when there are two actual value to be
		// compared upon .
		favorites.put("Sam", null);
		favorites.merge("Tom", "Skyride", mapper);
		favorites.merge("Sam", "Skyride", mapper);
		System.out.println(favorites);

		Map<String, Integer> counts = new HashMap<String, Integer>();
		counts.put("Jenny", 1);

		BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
		System.out.println(mapper.apply("test", 2));
		Integer jenny = counts.computeIfPresent("Jenny", mapper);
		System.out.println(jenny);

		Function<String, Integer> absentMapper = (k) -> 1;
		Integer jennyAbsent = counts.computeIfAbsent("Jenny1", absentMapper);
		System.out.println("Jenny" + jennyAbsent);
		System.out.println(counts);

	}
}
