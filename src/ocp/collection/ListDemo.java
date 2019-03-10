package ocp.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ListDemo {
	public static void main(String args[]) {
		List<String> testList = new ArrayList<>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		for (ListIterator<String> iterator = testList.listIterator(); iterator
				.hasNext();) {
			System.out.println("iterator .nextIndex:" + iterator.nextIndex()
					+ ", element:" + iterator.next());
			if (iterator.nextIndex() == 1) {
				iterator.add("test");
				System.out.println("Next Index:" + iterator.nextIndex()
						+ ",element:" + iterator.next());
				System.out.println("Previous:" + iterator.previous());
				System.out.println("Previous:" + iterator.previous());
				iterator.remove();

			}
		}
		Map<String, String> testMap = new HashMap<>();
		testMap.put(null, null);
		System.out.println(testMap);
		Map<String, String> testTable = new Hashtable<>();
		// testTable.put(null, null);

		Set<Integer> testSet = new TreeSet<Integer>();
		Integer i1 = 2;
		Integer i2 = 3;
		testSet.add(i2);
		testSet.add(i1);
		System.out.println(testSet);
		System.out.println(i1.compareTo(i2));
	}
}
