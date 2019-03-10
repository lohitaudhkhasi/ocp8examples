package ocp.chap7;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ClassicZooManager {
	private Map<String, String> foodData = new HashMap<>();

	public synchronized void put(String key, String value) {
		foodData.put(key, value);
	}

	public synchronized Object get(String key) {
		return foodData.get(key);
	}

	// Concurrent Equivalents
	private Set<String> conSet = new CopyOnWriteArraySet<String>();

	public static void main(String args[]) {
		Map<String, Integer> map = new ConcurrentHashMap<>();
		map.put("zebra", 52);
		map.put("elephant", 10);
		System.out.println(map.get("elephant"));

		Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		queue.offer(31);
		System.out.println(queue.peek());
		System.out.println(queue.poll());

		Deque<Integer> dequeue = new ConcurrentLinkedDeque<Integer>();
		dequeue.offer(10);
		dequeue.push(4);
		System.out.println(dequeue.peek());
		System.out.println(dequeue.pop()); // 4
		System.out.println(dequeue.pop()); // 10

		BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<Integer>();
		try {
			blockingQueue.offer(10, 2, TimeUnit.SECONDS);
			blockingQueue.poll(2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		BlockingDeque<Integer> blockingDeQueue = new LinkedBlockingDeque<Integer>();
		try {
			blockingDeQueue.offer(10, 2, TimeUnit.SECONDS);
			blockingDeQueue.poll(2, TimeUnit.SECONDS);
			blockingDeQueue.offerFirst(1);
			blockingDeQueue.offerFirst(3, 4, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ConcurrentSkipListSet<String> skipList = new ConcurrentSkipListSet<>();
		skipList.add("Neha");
		skipList.add("Lohit");
		System.out.println(skipList);
		System.out.println(skipList.ceiling("N"));
		System.out.println(skipList.floor("n"));

		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
		for (Integer l : list) {
			System.out.println("item-" + l);
			list.add(9);
		}
		System.out.println();
		System.out.println("Size:" + list.size());
	}
}
