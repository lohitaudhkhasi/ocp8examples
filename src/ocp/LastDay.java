package ocp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

public class LastDay {
	public static void main(String args[]) {
		NavigableMap<String, String> testMap = new TreeMap<>();
		testMap.put("a", "test1");
		testMap.put("b", "test2");
		testMap.values().remove("test1");
		// testMap.values().add("test2");
		System.out.println(testMap);
		TestType<Integer> xtest = new TestType<>();
		// xtest.print("look");
		List<String> list = new ArrayList<>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");
		Iterator<String> lt = list.listIterator(3d);
		while (lt.hasNext()) {
			System.out.println(lt.next());
		}
	}
}

class TestType<T extends Number> {
	public void print(T t) {
		System.out.println(t);
	}
}