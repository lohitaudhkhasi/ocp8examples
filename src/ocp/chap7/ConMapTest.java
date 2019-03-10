package ocp.chap7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ConMapTest {
	public static void main(String[] args) {
		Map<String, List<String>> map = new ConcurrentHashMap<>();
		Function<String, List<String>> absFunc = (a) -> {
			List<String> l = new ArrayList<>();
			for (int i = 0; i < a.length(); i++) {
				l.add("" + i);
			}
			return l;
		};

		List<String> listValue = new ArrayList<>();
		listValue.add("tom");
		map.computeIfAbsent("test", absFunc);
		System.out.println(map);
		BiFunction<List<String>, List<String>, List<String>> mergefunc = (a, b) -> {
			b.add("gap");
			b.addAll(a);
			return b;
		};
		map.merge("temp", listValue, mergefunc);
		System.out.println(map);
	}
}
