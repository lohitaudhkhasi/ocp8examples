package ocp.pages.notes1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Page6 {
	public static void main(String[] args) {
		List<String> test = new ArrayList<>();
		System.out.println(test.add("aa"));
		System.out.println(test.add("bb"));
		System.out.println(test.set(0, "cc"));
		// System.out.println(test.set(2, "cc"));
		System.out.println(test.get(1));
		System.out.println(test.remove(0));
		// System.out.println(test.remove(32));
		System.out.println(test.remove("aa"));
		System.out.println(test);
		// index is inclusive
		ListIterator<String> lit = test.listIterator(1);
		while (lit.hasNext()) {
			System.out.println(lit.next());
			System.out.println(lit.nextIndex());
		}
		System.out.println("_________________");
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.ensureCapacity(20);
		System.out.println(arraylist.size());
		Queue<String> queue = new LinkedBlockingQueue();
		arraylist.removeAll(queue);

	}
}
