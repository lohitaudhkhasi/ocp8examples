package ocp.chap3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class ListTest {
	public static void main(String args[]) {
		Collection col = new ArrayList<String>();
		System.out.println(col.add("Test"));
		// boolean add (Object object)
		// boolean remove (Object object)
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		System.out.println(birds.contains("hawk"));
		System.out.println(birds.contains("robin"));
		// Linked is special case of list and queue, additional method of
		// removing and adding from the end.
		// Instead of Stack, we can use Array Deque

		// In set , Hashset, you lose the order in which they were set/Treeset
		// mainatins the order
		Set t = new TreeSet();
		System.out.println(t instanceof NavigableSet);
		Deque<String> dequeue = new ArrayDeque<String>();
		// dequeue.add()
		dequeue.offer("first");
		dequeue.offer("second");
		dequeue.push("third");
		System.out.println(dequeue);
		System.out.println(dequeue.peekFirst());
		System.out.println(dequeue.poll());
		System.out.println(dequeue.poll());
		System.out.println(dequeue.poll());

		List<Integer> intList = new ArrayList<>();
		// intList.remove(0);
		OuterWorld ow = new OuterWorld();
		ow.method();
		// sub List example
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		System.out.println("actual list:" + list);
		List<Integer> subList = list.subList(1, 4);
		System.out.println("sublist:" + subList);
		subList.add(5);
		System.out.println("actual list:" + list);
		// Both will throw ConcurrentModificationException as original list
		// structure changes
		// list.add(1, 29);
		// list.remove(1);
		System.out.println("list after removal of 4:" + subList);

	}
}

class OuterWorld {
	public InnerPeace i = new InnerPeace();

	public void method() {
		System.out.println(i.reason);
	}

	private class InnerPeace {
		private String reason = "none";
	}
}