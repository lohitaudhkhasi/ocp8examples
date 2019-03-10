package ocp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.function.UnaryOperator;

public class Review3 {
	public static void main(String[] args) {
		NavigableMap<String, String> mymap = new TreeMap<String, String>();
		mymap.put("a", "apple");
		mymap.put("b", "boy");
		mymap.put("c", "cat");
		mymap.put("aa", "apple1");
		mymap.put("bb", "boy1");
		mymap.put("cc", "cat1");

		mymap.pollLastEntry(); // LINE 1
		mymap.pollFirstEntry(); // LINE 2

		NavigableMap<String, String> tailmap = mymap.tailMap("bb", false); // LINE
																			// 3

		System.out.println(tailmap.pollFirstEntry()); // LINE 4
		System.out.println(mymap.size()); // LINE 5
		Integer i = null;
		// int x = i;
		List<Integer> ls = Arrays.asList(1, 2, 3);

		String val1 = "hello";
		StringBuilder val2 = new StringBuilder("world");
		UnaryOperator<String> uo1 = s1 -> s1.concat(val1); // 1
		UnaryOperator<String> uo2 = s -> s.toUpperCase(); // 2
		Map<String, String> testMap = new HashMap<>();
		System.out.println(testMap.put("x", "y"));
		System.out.println(testMap.put("x", "z"));
	}
}

class Book {

}

class BookStore {
	Map<Book, Integer> map = new HashMap<Book, Integer>();

	int getNumberOfCopies(Book b) {
		return map.get(b);
	}

	public void addBook(Book b, int numberofcopies) {
		map.put(b, numberofcopies);
	}
	// ... other useful methods.
}
